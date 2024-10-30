package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


	}
	public static boolean isMutant (String dna[]){
		int tammano = dna.length;
			int aciertos[] = {0,0,0,0,0,0,0,0};
			int genmutante = 0;
			int ultimo ;
			int ultimoV ;
			for(int i = 0 ; i<tammano;i++)
			{
				ultimo = -1;
				ultimoV = -1;
				for(int j = 0 ;j<tammano;j++)
				{
					char letter = dna[i].charAt(j);
					char letterV = dna[j].charAt(i);
					switch (letter){
						case 'A' : aciertos[0]++ ;if(ultimo!=0&&ultimo != -1)if(aciertos[ultimo]<4||aciertos[ultimo]%4==0)aciertos[ultimo]--; ultimo = 0 ; break;
						case 'T' : aciertos[1]++ ;if(ultimo!=1&&ultimo != -1)if(aciertos[ultimo]<4||aciertos[ultimo]%4==0)aciertos[ultimo]--; ultimo = 1 ; break;
						case 'G' :  aciertos[2]++ ;if(ultimo!=2&&ultimo != -1)if(aciertos[ultimo]<4||aciertos[ultimo]%4==0)aciertos[ultimo]--; ultimo = 2 ; break;
						case 'C' : aciertos[3]++ ;if(ultimo!=3&&ultimo != -1)if(aciertos[ultimo]<4||aciertos[ultimo]%4==0)aciertos[ultimo]--; ultimo = 3; break;
					}
					switch (letterV){
						case 'A': aciertos[4]++;if(ultimoV!=4&&ultimoV != -1)if(aciertos[ultimoV]<4||aciertos[ultimo]%4==0)aciertos[ultimoV]--; ultimoV = 4 ; break;
						case 'T': aciertos[5]++;if(ultimoV!=5&&ultimoV != -1)if(aciertos[ultimoV]<4||aciertos[ultimo]%4==0)aciertos[ultimoV]--; ultimoV = 5 ; break;
						case 'G' :  aciertos[6]++;if(ultimoV!=6&&ultimoV != -1)if(aciertos[ultimoV]<4||aciertos[ultimo]%4==0)aciertos[ultimoV]--; ultimoV = 6 ; break;
						case 'C' : aciertos[7]++;if(ultimoV!=7&&ultimoV != -1)if(aciertos[ultimoV]<4||aciertos[ultimo]%4==0)aciertos[ultimoV]--; ultimoV = 7 ; break;
					}
				}
				for(int k=0;k<=7;k++)
				{
					if(aciertos[k]>=4)
					{
						genmutante++;
					}
					aciertos[k]=0;
				}
			}
			//diagonal
			for(int i = 0 ; i<tammano;i++)
			{
				ultimo = -1;
				ultimoV = -1;
				for(int j = 0 ;j<tammano;j++)
				{
					if((i+j)<tammano){
						char letter = dna[j].charAt(i+j);
						switch (letter){
							case 'A' : aciertos[0]++ ;if(ultimo!=0&&ultimo != -1)if(aciertos[ultimo]<4||aciertos[ultimo]%4==0)aciertos[ultimo]--; ultimo = 0 ; break;
							case 'T' : aciertos[1]++ ;if(ultimo!=1&&ultimo != -1)if(aciertos[ultimo]<4||aciertos[ultimo]%4==0)aciertos[ultimo]--; ultimo = 1 ; break;
							case 'G' :  aciertos[2]++ ;if(ultimo!=2&&ultimo != -1)if(aciertos[ultimo]<4||aciertos[ultimo]%4==0)aciertos[ultimo]--; ultimo = 2 ; break;
							case 'C' : aciertos[3]++ ;if(ultimo!=3&&ultimo != -1)if(aciertos[ultimo]<4||aciertos[ultimo]%4==0)aciertos[ultimo]--; ultimo = 3; break;
						}
					}
					if((tammano-j)<tammano&&(i+j)<tammano){
						char letterV = dna[i+j].charAt(tammano-j);
						switch (letterV){
							case 'A': aciertos[4]++;if(ultimoV!=4&&ultimoV != -1)if(aciertos[ultimoV]<4||aciertos[ultimo]%4==0)aciertos[ultimoV]--; ultimoV = 4 ; break;
							case 'T': aciertos[5]++;if(ultimoV!=5&&ultimoV != -1)if(aciertos[ultimoV]<4||aciertos[ultimo]%4==0)aciertos[ultimoV]--; ultimoV = 5 ; break;
							case 'G' : aciertos[6]++;if(ultimoV!=6&&ultimoV != -1)if(aciertos[ultimoV]<4||aciertos[ultimo]%4==0)aciertos[ultimoV]--; ultimoV = 6 ; break;
							case 'C' : aciertos[7]++;if(ultimoV!=7&&ultimoV != -1)if(aciertos[ultimoV]<4||aciertos[ultimo]%4==0)aciertos[ultimoV]--; ultimoV = 7 ; break;
						}
					}
				}
				for(int k=0;k<=7;k++)
				{
					if(aciertos[k]>=4)
					{
						genmutante ++;
					}
					aciertos[k]=0;
				}
			}
			//diagonalContraria
			for(int i = 0 ; i<tammano;i++)
			{
				ultimo = -1;
				ultimoV = -1;
				for(int j = 0 ;j<=tammano;j++)
				{
					if((i+j)<tammano&& (i+j) != j){
						char letter = dna[i+j].charAt(j);
						switch (letter){
							case 'A' : aciertos[0]++ ;if(ultimo!=0&&ultimo != -1)if(aciertos[ultimo]<4||aciertos[ultimo]%4==0)aciertos[ultimo]--; ultimo = 0 ; break;
							case 'T' : aciertos[1]++ ;if(ultimo!=1&&ultimo != -1)if(aciertos[ultimo]<4||aciertos[ultimo]%4==0)aciertos[ultimo]--; ultimo = 1 ; break;
							case 'G' :  aciertos[2]++ ;if(ultimo!=2&&ultimo != -1)if(aciertos[ultimo]<4||aciertos[ultimo]%4==0)aciertos[ultimo]--; ultimo = 2 ; break;
							case 'C' : aciertos[3]++ ;if(ultimo!=3&&ultimo != -1)if(aciertos[ultimo]<4||aciertos[ultimo]%4==0)aciertos[ultimo]--; ultimo = 3; break;
						}
					}

					if((tammano-i-j)>=0&&(i+j)<tammano){

						char letterV = dna[tammano-i-j-1].charAt(j);
						switch (letterV){
							case 'A': aciertos[4]++;if(ultimoV!=4&&ultimoV != -1)if(aciertos[ultimoV]<4||aciertos[ultimo]%4==0)aciertos[ultimoV]--; ultimoV = 4 ; break;
							case 'T': aciertos[5]++;if(ultimoV!=5&&ultimoV != -1)if(aciertos[ultimoV]<4||aciertos[ultimo]%4==0)aciertos[ultimoV]--; ultimoV = 5 ; break;
							case 'G' : aciertos[6]++;if(ultimoV!=6&&ultimoV != -1)if(aciertos[ultimoV]<4||aciertos[ultimo]%4==0)aciertos[ultimoV]--; ultimoV = 6 ; break;
							case 'C' : aciertos[7]++;if(ultimoV!=7&&ultimoV != -1)if(aciertos[ultimoV]<4||aciertos[ultimo]%4==0)aciertos[ultimoV]--; ultimoV = 7 ; break;
						}
					}
				}
				for(int k=0;k<=7;k++)
				{
					if(aciertos[k]>=4)
					{
						genmutante ++;
					}
					aciertos[k]=0;
				}
			}
			if(genmutante>=2){

				return true;
			}
			else
			{
				return false;
			}
	}

}
