#include<iostream>
using namespace std;
int main()
{
  int n,count=0;
  std::cin>>n;
  while (n != 1)
  {
    count=count+1;
    std::cout << n <<endl;
    if (n & 1)
      n = 3*n +1;
    else
      n = n/2;
  }
  std::cout << n<<endl;
  std::cout<<count;
}