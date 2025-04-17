// #include <iostream>
// #include <stdlib.h>
// #include<stdio.h>
// #include<math.h>
// using namespace std;

// int main(){
//     int *ptr;
//     int var = 23;
//     ptr = &var;
//     // *ptr = var;
//     // *ptr = &var;
//     cout<<ptr<<endl;
//     cout<<*ptr<<endl;
//     cout<<&var<<endl;
//     cout<<var<<endl;

// }
// #include <iostream>
// #include <iomanip>

// int main() {
//   double pi = 3.14159265358979323846;
//   // Set field width and precision for output
//   std::cout << std::setw(10) << std::setprecision(5) << pi << std::endl; // Output:   3.1416
//   std::cout << std::setw(15) << std::setfill('0') << 123 << std::endl; // Output: 000000123
//   std::cout << std::setbase(16) << 15 << std::endl; // Output: f (hexadecimal)

//   return 0;
// }
#include <iostream>
using namespace std;
int main(){
  int i = 0;
  int n = 1;
  do{
    cout<<i<<endl;
    i++;
    n= n+1;
  }
  while(n<12);
}
