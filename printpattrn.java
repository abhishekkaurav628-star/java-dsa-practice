
class printpattrn {
    public static void main(String[] args){
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=5; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// hole pattrn:
// int a = 4;
// int b = 5;

// for(int i=1; i<=a; i++){
//     for(int j=1; j<=b; j++){
//         if(i==1 || j==1 || i==a ||j==b ){
//         System.out.print("*");

//     } else {
//     System.out.print(" ");
// }
// }
// System.out.println();
//     }
// }
// }

// pyramid pattrn
// for(int i=1; i<=4; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
//     }
// }
// int n=4;
// for(int i=1; i<=n; i++){
//     for(int j=i; j>= 1; j--){
//         System.out.print("* ");

//     }
//     System.out.println();
        
// }


//     }
// }
//      int n = 4; 
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
//     }
// }

// int n =5;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print(j+" ");
//     }
//     System.out.println();
// }
//     }
// }

// int n =5;
// for(int i=n; i>=1; i--){
//     for(int j=1; j<=i; j++){
//         System.out.print(j+" ");
//     }
//     System.out.println();
// }
//     }
// }

// Floyed triangle 

// int n = 5;
// int nums = 1;
// for(int i=0; i<=n; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print(nums+" ");
//         nums++;
//     }
//     System.out.println();

// }
//     }
// }

// 0-1 trinagle
int num = 5;

for(int i=1; i<=num; i++){
    for(int j=1; j<=i; j++){
        int sum = i+j;

    if(sum%2==0){
        System.out.print("1 ");

    }else{
        System.out.print("0 ");
    }
}
   System.out.println();
}
}
    }






