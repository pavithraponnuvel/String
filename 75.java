int[] n=new int[5];
        int[] a=new int[5];
        int i,j,k;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++){
            n[i]=sc.nextInt();
        }for(i=0;i<5;i++){
            if(n[i]!=n[4]){
            if(n[i]>n[i+1]){
                a[i]=n[i+1];
                System.out.println(""+a[i]);
            }
            else{
                a[i]=-1;
                System.out.println(""+a[i]);
            }
            }else{
             if(n[4]>n[0]){
                 System.out.println(""+n[0]);
            }else{
                 System.out.println(-1);
             }}
        }
          