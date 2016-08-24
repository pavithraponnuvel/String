      int[] a=new int[5];
            int[] b=new int[5];
            int i,j = 0,n,f=0,c=0,k;
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            for(i=0;i<5;i++){
                a[i]=sc.nextInt();
            }
            for(i=0;i<5;i++){
                if(n==a[i]){
                    a[i]='\0';
                }
            }for(i=0;i<5;i++){
              if(a[i]==0){
                  continue;
              }else{
                  b[j]=a[i];
                  j++;
              }
            }for(i=0;i<j;i++){
                System.out.println(""+b[i]);
            }
   
    }
    
    }
    