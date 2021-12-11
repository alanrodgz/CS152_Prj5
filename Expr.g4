/*
 * EBNF Grammar for Dialect of Prolog Used in Program #5
 *
 * Michael McThrow
 * CS 152 Section 6 -- Programming Paradigms
 * San José State University
 * Fall 2021
 */

grammar Expr;

prog: (expr NEWLINE)*;

expr: program | query ;

/* Atoms are identifiers that start with a lowercase letter and can contain
 * a combination of lowercase letters, numerals, and underscores.  We are
 * also going to make zero an atom in order to accommodate natural numbers
 * per Program #4.
 */
ATOM: [a-z]([a-z]|[0-9]|'_')* | '0';
	
/* Variables are identifiers that start with an uppercase letter and can
 * contain a combination of letters, numerals, and underscores.
 */
VAR: [A-Z]([a-z]|[A-Z]|[0-9]|'_')*;

/* A term is either an atom or a variable */
term: ATOM | VAR;

/* An element is either a term, a list, or a compound */
element: 	term
             | 	list
             | compound;


/* The <elements> rule consists of one or more elements delimited by a comma */
elements: 	element
             | 	element ',' elements;


/* A list could have the following forms:
 * 1.  The empty list []
 * 2.  A list of elements (cound contain lists)
 * 3.  A pair, where the first and rest of the pair are delimited by the
 *     pipe (|) symbol (e.g. [X|Xs]), and where the first and rest are
*     elements (for example, [a,b,c|[d,e,f]] is valid both grammatically
*     and semantically.  To make grammar construction simpler, the example
*     [a,b,c|d,e,f] is grammatically valid but semantically incorrect since
*     the latter part of the pair must either be a list or a variable that
*     unifies with a list.
*/
list: 	'[]'
	| '[' elements ']'
  	| '[' elements '|' elements ']';


/* A compound starts with either an atom or a period, is followed by the open
 * parenthesis, then is followed by one or more elements delimited by commas,
 * and is followed by the closed parenthesis.
 *
 * e.g., evolution(bulbasaur,ivysaur)
 * e.g., natural_number(s(s(s(0))))
 *
 * Note that the special compound .(X,Y) (the dot functor) represents the pair
 * [X|Y]; please refer to page 56 in The Art of Prolog.  This is very important
 * knowledge for getting resolution and unification working correctly on lists,
 * since lists are represented internally as pairs, and pairs are represented
 * internally using the dot functor.
 */
compound: 	ATOM '(' elements ')'
             	| '.(' elements ')';


/* A conjunction is one or more compounds delimited by commas.*/
conjunction:	compound
                | compound ',' conjunction;

/* A rule consists of either a compound or a compound with a conjunction,
 * joined with the :- (implies that) operator.*/
prolog_rule: 		compound
           	| compound ':-' conjunction;



/* A program is a sequence of rules that end with a period.  Ideally the
 * sequence should be delimited by new lines; if you are using ANTLR, then
 * you should take advantage of the WS rule.
 */
program: 	(prolog_rule '.')+;


/* A query is a conjunction that ends with a question mark. */
query: 		conjunction '?';


NEWLINE: [\r\n]+;
WS: [\t]+ -> skip;

