grammar WebtestInputValidation;

webtestInput: formDefinition;

formDefinition: FORM formID END ;
formID: ID;

FORM: 'form';
END: 'end';

ID: [a-zA-Z_][a-zA-Z0-9_]*;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
WS: [ \t\r\n] -> skip;