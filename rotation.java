 int[] n=new int[100];
        int i,a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements");
        a=sc.nextInt();
        for(i=0;i<a;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("rotation");
        b=sc.nextInt();
       for(i=b;i<a;i++){
             System.out.println(""+n[i]);
         }
          for(i=0;i<b;i++){
            System.out.println(""+n[i]);
        }