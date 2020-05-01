#include<iostream>
using namespace std;
int main()
{
 int rate,pamount,n;
 float finala,inter,amount,disc;
 std::cin>>pamount;
 std::cin>>rate;
 std::cin>>n;
 inter=(pamount*n*rate)/100;
 amount=pamount+inter;
 disc=inter*2/100;
 finala=pamount+inter-disc;
 std::cout<<inter<<endl;
 std::cout<<amount<<endl;
 std::cout<<disc<<endl;
 std::cout<<finala;
}