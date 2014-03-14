grammar NetworkProtocol;

start
:
	'protocol' name = ID LBRACE vardef+ RBRACE # protocol
;

vardef
:
	name = ID ':' type = VARTYPE # variableDef
;

VARTYPE
:
	'int' LPAREN NUMBER RPAREN
	| 'byte'
	| 'char'
	| 'timestamp'
;

ID
:
	[a-zA-Z]+
;

NUMBER
:
	[1-9][0-9]+
;

LBRACE
:
	'{'
;

RBRACE
:
	'}'
;

LPAREN
:
	'('
;

RPAREN
:
	')'
;

WS
:
	[ \t\r\n]+ -> skip
;