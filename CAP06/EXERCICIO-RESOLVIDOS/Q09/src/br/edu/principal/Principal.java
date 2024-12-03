package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] voo = new int[12], lugares = new int[12];
		int i,num_voo;
		String [] origem = new String[12], destino = new String[12];
		String op, op2,local;
		boolean encontrado;
		
		for(i = 0; i<12; i++) {
			System.out.print("Digite o número do " + (i+1) +"° voo: ");
			voo[i] = sc.nextInt();

			System.out.print("Digite a quantidade de lugares do " + (i+1) + "° voo: ");
			lugares[i] = sc.nextInt();

			System.out.print("Digite a origem do " + (i+1) +"° voo: ");
			origem[i] = sc.next();

			System.out.print("Digite o destino do " + (i+1) +"° voo: ");
			destino[i] = sc.next();
		}
		
		while(true) {
			System.out.println("1 - Consultar" + "\n" + "2 - Reservar" + "\n" + "3 - Finalizar");
			
			System.out.print("Digite sua opção: ");
			op = sc.next();
			
			if (op.equals("1")) {
				System.out.println("1 - Consultar por voo" + "\n" + "2 - Consultar por origem" + "\n" + "3 - Consultar por Destino");
				System.out.print("Digite sua opção: ");
				op2 = sc.next();
				
				while (true) {
					if (op2.equals("1")) {
						 System.out.print("Digite número do voo: ");
						 num_voo = sc.nextInt();
						 
						 i = 0;
						 while (i < 12 && voo[i] != num_voo ) {
							 i++;
						 }
						 
						 if (i == 12) {
							 System.out.println("Voo inexistente!");
						 }
						 
						 else {
							 System.out.println("Número do voo:" + voo[i]);
							 System.out.println("Local de origem: " + origem[i]);
							 System.out.println("Local de destino: " + destino[i]);
							 System.out.println("Lugares disponíveis: " + lugares[i]);
						 }
						 break;
					}
					
					else if(op2.equals("2")) {
						System.out.print("Digite o local de origem: ");
						local = sc.next();
						encontrado = false;
						for (i = 0; i < 12; i++) {
							if(local.equalsIgnoreCase(origem[i])) {
								 encontrado = true;
								 System.out.println("Número do voo:" + voo[i]);
								 System.out.println("Local de origem: " + origem[i]);
								 System.out.println("Local de destino: " + destino[i]);
								 System.out.println("Lugares disponíveis: " + lugares[i]);
							}
						}
						if (encontrado == false) {
							 System.out.println("Não temos nenhum voo dessa origem. ");
						}
						break;
					}
					
					else if(op2.equals("3")) {
						System.out.print("Digite o local de destino: ");
						local = sc.next();
						encontrado = false;
						
						for (i = 0; i < 12; i++) {
							if(local.equalsIgnoreCase(destino[i])) {
								 System.out.println("Número do voo:" + voo[i]);
								 System.out.println("Local de origem: " + origem[i]);
								 System.out.println("Local de destino: " + destino[i]);
								 System.out.println("Lugares disponíveis: " + lugares[i]);
								 encontrado = true;
							}
						}
						
						if (encontrado == false) {
							 System.out.println("Não temos nenhum voo para esse destino.");
						}
						break;	
					}
					
					else {
						System.out.println("Inválido! Tente novamente!");
					}
				}
				
			}
			
			else if (op.equals("2")) {
				System.out.print("Digite o número do voo desejado: ");
				num_voo = sc.nextInt();
				
				i = 0;
				while(i < 12 && voo[i] != num_voo) {
					i++;
				}
				
				if (i == 12) {
					System.out.println("Número do voo não encontrado");
				}
				
				else {
					if (lugares[i] == 0) {
						System.out.println("Voo lotado");
					}
					
					else {
						lugares[i] = lugares[i] - 1;
						System.out.println("Reserva Confirmada!");
					}
				}
				
			}
			
			else if (op.equals("3")) {
				System.out.println("Saindo...");
				break;
			}
			
			else {
				System.out.println("Inválido! Tente Novamente!");
			}
			
			
		}

	}

}