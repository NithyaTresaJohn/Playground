#include<iostream>
using namespace std;
int main()
{
  int petrol,dist;
  float mileage,sum;
  std::cin>>mileage>>petrol>>dist;
  sum=float(dist/petrol);
  if(sum>=mileage)
    std::cout<<"Cannot reach";
  else
    std::cout<<"Can reach";
}