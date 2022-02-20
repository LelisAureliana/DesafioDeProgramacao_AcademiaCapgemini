package questao2;

/**
*
* @author Aureliana
*/
	public class VerificaSenhaForte {

		private String senha;

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public VerificaSenhaForte(String senha) {
			this.senha = senha;
		}

	/*Fun��o para verificar os crit�rios de senha forte.
	 	* Possuir no m�nimo 6 caracteres.
		* Cont�r no m�nimo 1 digito.
		* Cont�r no m�nimo 1 letra em min�sculo.
		* Cont�r no m�nimo 1 letra em mai�sculo.
		* Cont�r no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+
	*/
		boolean verificarSenhaForte() {
			
			

			if (this.senha.length() < 6) {
				System.out.println(this.senha.length());
				System.out.println("Possui menos de 6 caractere!");
				return false;
			}

			if (verificarCaractereNumerico(this.senha)) {
				System.out.println("A senha n�o cont�m digito num�rico!");
				return false;
			}
			
			if(verificarCarectereMinusculo(this.senha)){
				System.out.println("A senha n�o cont�m caractere min�sculo");
				return false;
			}


			if (verificarCaractereMaiusculo(this.senha)) {
				System.out.println("A senha n�o cont�m caractere Mai�sculo!");
				return false;
			}
			
			if(verificarCaracteEspecial(this.senha)) {
				System.out.println("A senha n�o cont�m caractere especial!");
				return false;
			}
					
			return true;
		}


		private boolean verificarCaractereNumerico(String senha) {
			return senha.matches("[^0-9]+");
		}
		private boolean verificarCarectereMinusculo(String senha) {
			return senha.matches("[^a-z]+");
		}
		private boolean verificarCaractereMaiusculo(String senha) {
			return senha.matches("[^A-Z]+");
		}
		private boolean verificarCaracteEspecial(String senha) {
			return senha.matches("!@#$%^&*()-+");
		}
		
	}