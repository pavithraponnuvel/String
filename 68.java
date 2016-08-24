int[] a=new int[5];
            int[] b=new int[5];
            int i,j = 0,n1 = 0,n2 = 0,f=0,k,m;
            Scanner sc=new Scanner(System.in);
            
            for(i=0;i<5;i++){
                a[i]=sc.nextInt();
                }
            for(i=0;i<5-1;i++){
                {
               b[j]=Math.abs(a[i+1]-a[i]);
                j++;}
                } for(i=0;i<j;i++){
                    if(f<b[i]){
                        f=b[i];
                    }
                }
         for(i=0;i<5-1;i++){ 
              k =Math.abs(a[i+1]-a[i]);
               if(f==k){
                  n1=a[i];
                  n2=a[i+1];
               }
                j++;}
         m=Math.max(n1, n2);
                  for(i=0;i<5-1;i++){
                      if(m==a[i]){
                          System.out.println(""+i);
                      }
                  }   