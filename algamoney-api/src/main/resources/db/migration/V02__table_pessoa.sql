CREATE TABLE pessoa(	
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(155) NOT NULL,
	logradouro VARCHAR(155),
	numero VARCHAR(155),
	complemento VARCHAR(155),
	bairro VARCHAR(155),
	cep VARCHAR(155),
	cidade VARCHAR(155),
	estado VARCHAR(155),
	status BOOLEAN NOT NULL
	) ENGINE=InnoDB DEFAULT CHARSET=utf8;
	
	INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, status) VALUES ('Cauã', 'Rua Petrin', '65', null, 'Jardim', '123012', 'curitiba', 'parana', true);