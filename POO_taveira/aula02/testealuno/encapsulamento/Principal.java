public class Principal {

	public static void main(String[] args) {
	
		
		Aluno aluno1;
	aluno1 = new Aluno();
	aluno1.setNome("Neto");
	aluno1.setCpf("521.XXX.XXX.XX");
	aluno1.setSemestre("P7");
	
	Aluno aluno2;
	aluno2 = new Aluno();
	aluno2.setNome("Livia");
	aluno2.setCpf("125.XXX.XXX.XX");
	aluno2.setSemestre("P3");
	
	
	System.out.println();
	System.out.println("Aluno 1");
	System.out.println("Nome: "+aluno1.getNome()); 
	System.out.println("CPF: "+aluno1.getCpf());
	System.out.println("Semestre: "+aluno1.getSemestre());
	System.out.println("Você está cadastrado;)");
									 
	System.out.println();
	System.out.println("Aluno 2");
	System.out.println("Nome: "+aluno2.getNome()); 
	System.out.println("CPF: "+aluno2.getCpf());
	System.out.println("Semestre: "+aluno2.getSemestre());
	System.out.println("Você está cadastrado;)");
	
	
	
	
	}

}
