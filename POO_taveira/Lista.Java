	
	public  class Lista implements Comparable{		
		int num;

		public Lista (int numero){
			this.num = numero;
		}

		public int compareTo(Object obj) {
	Lista outro = (Lista) obj;		
	int retorno = 0;
			if (num > outro.num) {
				retorno= -1;
			}
			
			if (num == outro.num) {
				retorno= 0;
			}
			
			if (num < outro.num) {
				retorno= 1;
			}
			return retorno;
	}
		}
	
