String s,s1="",s2="8xk",s3="",s4="";
        int i,j,n = 0,n1,n2,e1,e2,n3,n4,l;
        char[] c=new char[50];
        char[] c1=new char[50];
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        c=s.toCharArray();
        for(i=0;i<c.length;i++){
            n1=c[i];
            n2='8';
            if(n1==n2){
                n=i;
                e1='x';
                e2='k';
                 n3=c[n+1];
                 n4=c[n+2];
                 if((n3==e1)&&(n4==e2)){
                    for(j=0;j<8;j++){
                        s3=s3+"k";
                    }
                for(i=0;i<n;i++){
                    s1=s1+c[i];
                }
                for(i=n+3;i<c.length;i++){
                    s4=s4+c[i];
                }    
            }
            }
         }
        System.out.println(""+s1+""+s3+""+s4);
    }
}
