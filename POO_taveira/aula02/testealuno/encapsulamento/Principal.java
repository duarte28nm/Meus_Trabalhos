public class Principal {

	public static void main(String[] args) {
		       
		        //Aluno
				Aluno aluno1;
				aluno1 = new Aluno();
				aluno1.setNome("Livia");
				aluno1.setCpf("145.XXX.XXX.XX");
				aluno1.setSemestre("P6");
				aluno1.setMatricula("20162011060512");
				
				Aluno aluno2;
				aluno2 = new Aluno();
				aluno2.setNome("Neto");
				aluno2.setCpf("541.XXX.XXX.XX");
				aluno2.setSemestre("P8");
				aluno2.setMatricula("20162011060895");
				
				
				//Aluno
				System.out.println();
				System.out.println("Aluno 1");
				System.out.println("Nome: "+aluno1.getNome()); 
				System.out.println("CPF: "+aluno1.getCpf());
				System.out.println("Semestre: "+aluno1.getSemestre());
				System.out.println("Matricula: "+aluno1.getMatricula());
				System.out.println("Muito obrigado, volte sempre ;)");
				
				System.out.println();
				System.out.println("Aluno 2");
				System.out.println("Nome: "+aluno2.getNome()); 
				System.out.println("CPF: "+aluno2.getCpf());
				System.out.println("Semestre: "+aluno2.getSemestre());
				System.out.println("Matricula: "+aluno2.getMatricula());
				System.out.println("Muito obrigado, volte sempre ;)");
				
						

	}

}
