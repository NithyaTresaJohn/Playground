#include<iostream>
int main(){
  int* pvalue  = NULL;// Pointer initialized with null
  int n,o=0,e=0,i;
  std::cin>>n;
  pvalue  = new int[n];   
  for(i=0;i<n;i++)
  {
    std::cin>>pvalue[i];
    if(pvalue[i]%2==0)
      e++;
    else
      o++;
  }
  std::cout<<o<<"\n"<<e;
  return 0;
}