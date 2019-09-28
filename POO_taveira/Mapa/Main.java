class Main{
  public static void main(String args[]){
	  
    ///////////////FP
    FolhaPagamento fp = new FolhaPagamento(9, 2019);

    //////////////CL
    Colaborador cl01 = new Colaborador(100, "Maoel Claudino", "Av 13 de Maio, 2081", "8867-1020", "Benfica", "60020-060", "124543556-89", 4500f);
    Colaborador cl02 = new Colaborador(200, "Carmelina da Silva", "Avenida dos Expedicionários, 1200" ,"3035-1280", "Aeroporto", "60530-020", "301789435-54", 2500f);
    Colaborador cl03 = new Colaborador(300, "Gurmelina Castro Saraiva", "Av João Pessoa, 1020", "3235-1089", "Damas", "60330-090", "350245632-76", 3000f);
    Colaborador cl04 = new Colaborador(400, "Joana Dark", "Rua 1, 1001", "3535-1389", "Alagadim", "60432-050", "330247682-16", 3210f);
    Colaborador cl05 = new Colaborador(500, "Lamar Jonas", "Av mil e um, 300", "3333-1519", "Nova", "61332-697", "360341692-76", 2100f);

    /////////////MF
    MovimentoFolha mf01 = new MovimentoFolha(cl01, "Salario", 4500f, "P");
    MovimentoFolha mf02 = new MovimentoFolha(cl01, "Plano Saúde", 1000f, "P");
    MovimentoFolha mf03 = new MovimentoFolha(cl01, "Pensão", 600f, "D");
    MovimentoFolha mf04 = new MovimentoFolha(cl02, "Salario", 2500f, "P");
    MovimentoFolha mf05 = new MovimentoFolha(cl02, "Gratificação", 1000f, "P");
    MovimentoFolha mf06 = new MovimentoFolha(cl02, "Faltas", 1000f, "D");
    MovimentoFolha mf07 = new MovimentoFolha(cl03, "Salario", 3000f, "P");
    MovimentoFolha mf08 = new MovimentoFolha(cl03, "Férias", 800f, "D");
    MovimentoFolha mf09 = new MovimentoFolha(cl03, "Plano Saúde", 1000f, "D");
    MovimentoFolha mf10 = new MovimentoFolha(cl04, "Salario", 3210f, "P");
    MovimentoFolha mf11 = new MovimentoFolha(cl04, "Extras", 1000f, "P");
    MovimentoFolha mf12 = new MovimentoFolha(cl04, "Pensão", 800f, "D");
    MovimentoFolha mf13 = new MovimentoFolha(cl05, "Salario", 2100f, "P");
    MovimentoFolha mf14 = new MovimentoFolha(cl05, "Extras", 1500f, "P");
    MovimentoFolha mf15 = new MovimentoFolha(cl05, "Faltas", 800f, "D");

    /////////////INSERIR MOVIMENTO
    fp.inserirMovimento(mf01);
    fp.inserirMovimento(mf02);
    fp.inserirMovimento(mf03);
    fp.inserirMovimento(mf04);
    fp.inserirMovimento(mf05);
    fp.inserirMovimento(mf06);
    fp.inserirMovimento(mf07);
    fp.inserirMovimento(mf08);
    fp.inserirMovimento(mf09);
    fp.inserirMovimento(mf10);
    fp.inserirMovimento(mf11);
    fp.inserirMovimento(mf12);
    fp.inserirMovimento(mf13);
    fp.inserirMovimento(mf14);
    fp.inserirMovimento(mf15);

   /////////////INSERIR COLABORADOR
    fp.inserirColaborador(cl01);
    fp.inserirColaborador(cl02);
    fp.inserirColaborador(cl03);
    fp.inserirColaborador(cl04);
    fp.inserirColaborador(cl05);

    ////////////CALCULAR FOLHA
    System.out.println(fp.calcularFolha());

    System.out.println(cl01.calcularSalario(fp));
    System.out.println(cl02.calcularSalario(fp));
    System.out.println(cl03.calcularSalario(fp));
    System.out.println(cl04.calcularSalario(fp));
    System.out.println(cl05.calcularSalario(fp));
  }
}
