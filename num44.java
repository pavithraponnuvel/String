for(i=1;i<n;i++){
           if(i<10){
           if(i==3||i==4){
                System.out.println(""+i);
            }}if(i>=10){
                n1=i;
                c=0;
                while(n1!=0){
                  n2=n1%10;
                  if(n2==3||n2==4){
                        n1=n1/10;
               continue;
                }
               else{c++;
                break;}
                 
                }
                
                if(c==0){
                    System.out.println(""+i);
                }}
            }
        