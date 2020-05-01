#include<iostream>
using namespace std;
int main()
{
 int max,a,c,sum;
  std::cin>>max>>a>>c;
  sum=(75*a)+(30*c);
  if(sum<=max)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}