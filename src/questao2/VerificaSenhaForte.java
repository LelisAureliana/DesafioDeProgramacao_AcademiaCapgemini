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

	/*Função para verificar os critérios de senha forte.
	 	* Possuir no mínimo 6 caracteres.
		* Contér no mínimo 1 digito.
		* Contér no mínimo 1 letra em minúsculo.
		* Contér no mínimo 1 letra em maiúsculo.
		* Contér no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
	*/
		boolean verificarSenhaForte() {
			
			

			if (this.senha.length() < 6) {
				System.out.println(this.senha.length());
				System.out.println("Possui menos de 6 caractere!");
				return false;
			}

			if (verificarCaractereNumerico(this.senha)) {
				System.out.println("A senha não contém digito numérico!");
				return false;
			}
			
			if(verificarCarectereMinusculo(this.senha)){
				System.out.println("A senha não contém caractere minúsculo");
				return false;
			}


			if (verificarCaractereMaiusculo(this.senha)) {
				System.out.println("A senha não contém caractere Maiúsculo!");
				return false;
			}
			
			if(verificarCaracteEspecial(this.senha)) {
				System.out.println("A senha não contém caractere especial!");
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