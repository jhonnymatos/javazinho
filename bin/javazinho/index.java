package javazinho;

public class index {

		class Pessoa {
			private String nome;
			private int idade;
			public Pessoa(String nome, int idade) {
				this.nome = nome;
				this.idade = idade;
			}
			public String getNome() {
			return nome;
			}
			
			public int getIdade() {
			return idade;
			}
		}
		

		class Piloto extends Pessoa {
			private int CNH;
			public Piloto(String nome, int idade, int CNH) {
				super(nome, idade);
				this.CNH = CNH;
			}
			
			public int getCNH() {
				return CNH;
			}
			public void Acao() {
				System.out.println();
			}
		}
			
	//////////////////////////////////////////////////////////////////////////////////////////
		
		
		class Veiculo{
			private String marca;
			private String modelo;
			private int ano;
			
			public Veiculo(String marca, String modelo, int ano) {
				this.marca = marca;
				this.modelo = modelo;
				this.ano = ano;
			}
			
			public String getMarca() {
				return marca;
			}
			
			public String getModelo() {
				return modelo;
			}
			
			
			public int getAno() {
				return ano;
				}
			
			public void acelerar() {
				System.out.println("O veículo está acelerando");
			}
			
			public void frear() {
				System.out.println("O veículo está freando");
			}
	}
		
		
		class CarroEsportivo extends Veiculo {
			private int potencia;
			
			public CarroEsportivo(String marca, String modelo, int ano, int potencia) {
				super(marca, modelo, ano);
				this.potencia = potencia;
			}
			
			public void ativaModoTurbo() {
				System.out.println("Modo turbo ativado");
			}
		}
	//////////////////////////////////////////////////////////////////////////////////////////
		
			class Acao {
	        public void executar() {
			Piloto piloto1 = new Piloto ("João", 24, 40028922);
			CarroEsportivo carro1 = new CarroEsportivo("Ferrari", "F8 Tributo", 2023, 710);
			
			System.out.println("Piloto: " + piloto1.getNome());
			System.out.println("De " + piloto1.getIdade());
			System.out.println("Carro: " + carro1.getMarca());
			System.out.println("Ano: "+ carro1.getAno());
			System.out.println("Potencias: " + carro1.potencia+ "cv");
				}
			}
		}