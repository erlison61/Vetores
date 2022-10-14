
package com.mycompany.vetores;
public class MetodosVetor {


    public void copyVetor(){
         int a[] = {10, 20, 30, 40, 50};
            int b[] = new int[5];
            for(int i=0;i<a.length;i++){
                   b[i]=a[i];
                   System.out.println(b[i]);
            }
         }
    
    
    public void vetorMulti2(){
        int a[] = {10, 20, 30, 40, 50,60,70,80};
            int b[] = new int[8];
            for(int i=0;i<a.length;i++){
                   b[i]=a[i]*2;
                   System.out.println(b[i]);
            }
    }
    
    
    public void vetorQuadrado(){
        int a[] = {10, 20, 30, 40, 50,60,70,80,90,100,110,120,130,135,140};
            int b[] = new int[15];
            for(int i=0;i<a.length;i++){
                   b[i]=a[i]*a[i];
                   System.out.println(b[i]);
            }
    }
    
    public void vetorRaiz(){
        int a[] = {10, 20, 30, 40, 50,60,70,80,90,100,110,120,130,135,140};
            int b[] = new int[15];
            for(int i=0;i<a.length;i++){
                   b[i]=(int) Math.sqrt(a[i]);
                   System.out.println(b[i]);
            }
    }
    
    public void vetorIndice(){
         int a[] = {10, 20, 30, 40, 50,60,70,80,90,100};
         int b[] = new int[10];
         for(int i=0;i<a.length;i++){
                   b[i]=a[i]*i;
                   System.out.println(b[i]);
            }
    }
    
    public void vetorSoma(){
          int a[] = {10, 20, 30, 40, 50,70,80,90,100};
          int b[] ={10, 20, 30, 40, 50,70,80,90,100} ;
          int c[]=new int[10];
          for(int i=0;i<a.length;i++){
                   c[i]=b[i]+a[i];
                   System.out.println(c[i]);
            }
    }
    
    public void vetorSub(){
         int a[] = {10, 20, 30, 40, 50,70,80,90,100};
         int b[] ={10, 20, 30, 40, 50,70,80,90,100} ;
         int c[]=new int[10];
         for(int i=0;i<a.length;i++){
                   c[i]=b[i]-a[i];
                   System.out.println(c[i]);
            }
    }
    
     public void vetormulti(){
         int a[] = {10, 20, 30, 40, 50,70,80,90,100};
         int b[] ={10, 20, 30, 40, 50,70,80,90,100} ;
         int c[]=new int[10];
         for(int i=0;i<a.length;i++){
                   c[i]=b[i]*a[i];
                   System.out.println(c[i]);
            }
    }
     
     public void vetordivisao(){
         int a[] = {10, 20, 30, 40, 50,70,80,90,100};
         int b[] ={10, 20, 30, 40, 50,70,80,90,100} ;
         int c[]=new int[10];
         for(int i=0;i<a.length;i++){
                   c[i]=b[i]/a[i];
                   System.out.println(c[i]);
            }
    } 
    
    public void vetorResto(){
         int a[] = {10, 20, 30, 40, 50,60,70,80,90,100};
         int b[] = new int[10];
         for(int i=0;i<a.length;i++){
                   b[i]=a[i]%2;
                   System.out.println(b[i]);
            }
    }
    
    public void vetorPar(){
         int a[] = {10, 20, 33, 40, 55,60,71,80,93,100};
        
         for(int i=0;i<a.length;i++){
                   if(a[i]%2==0){
                         System.out.println(a[i]);
                   }
                  
            }
    }
    
    public void vetorAbs(){
         int a[] = {10, 20, 33, 40, 55,60,71,80,93,100};
        int soma=0;
         for(int i=0;i<a.length;i++){
                   soma+=a[i];
                   System.out.println(soma);
                 
                  
            }
    }
    
    
    
    
    
    
    
    
    
    
    
}
