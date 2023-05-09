package com.ivan.app_calcula_fuel;
import java.util.Scanner; 


public class AppCalculaFuelApplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String placa;
		double fuel, km60, km80, km100, km120, km140, gasolinaPorKm, gasolinaTotalPorKm, totalKm,mediaPonderada = 0;
		System.out.print("Digite a sua placa: ");
		placa = input.nextLine();
		
		System.out.print("Digite o valor do combustível: ");
		fuel = input.nextDouble();

		System.out.print("Digite a quantidade de quilômetros rodados a 60km/h: ");
		km60 = input.nextDouble();

		System.out.print("Digite a quantidade de quilômetros rodados a 80km/h: ");
		km80 = input.nextDouble();

		System.out.print("Digite a quantidade de quilômetros rodados a 100km/h: ");
		km100 = input.nextDouble();

		System.out.print("Digite a quantidade de quilômetros rodados a 120km/h: ");
		km120 = input.nextDouble();

		System.out.print("Digite a quantidade de quilômetros rodados a 140km/h: ");
		km140 = input.nextDouble();

		totalKm = km60 + km80 + km100 + km120 + km140;
		mediaPonderada = (km60*60 + km80*80 + km100*100 + km120*120 + km140*140) / totalKm;
		gasolinaTotalPorKm= (km60/30.7*fuel) + (km80/26.8*fuel) + (km100/22.4*fuel) + (km120/18.1*fuel) + (km140/14.5*fuel);
		gasolinaPorKm = gasolinaTotalPorKm/5;

		System.out.println("=============================================================================");
		System.out.println("Placa do veículo: " + placa);
		System.out.printf("Consumo total: %.4f litros. %n ", gasolinaPorKm);
		System.out.printf("Valor tota: R$ %.2f. %n",  gasolinaTotalPorKm); 
		System.out.printf("Velocidade média ponderada: %s km/h  %n", mediaPonderada);
		System.out.println("=============================================================================");
		
	}
}
