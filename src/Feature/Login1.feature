# language: pt
Funcionalidade: Ajuste no CRM #(RQF040 / 060)

	Cenario: Validar formas de pagamento conforme cadastrado 
		Dado que existam formas de pagamento cadastradas
		E estou logado no CRM 
		E estou na tela de "iniciar negocia��o (Menu A��es > Pesquisar, Pesquisar clientes % selecionar cliente com d�bito)"
		Quando eu acessar selecionar um item no Grid
		E clicar no bot�o "CALCULAR"
		E clicar no bot�o "BOTAO_ACORDO"
		E clicar no BOX "_ACOTIP"
		Entao nao deve lista formas de pagamento conforme cadastrado na tela de "Cadastro de formas de pagamento" #(RQF010)
