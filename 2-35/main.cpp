#include <iostream>

using namespace std;

int main()
{
    cout<<"����žų˷���"<<endl;
    for(int n=1;n<=9;n++){
     for(int i=1;i<=n;i++){
     int t;
     t=i*n;
     if(t<=9)
     cout<<n<<"*"<<i<<"="<<t<<"  ";
     else
     cout<<n<<"*"<<i<<"="<<t<<" ";
     }
     cout<<endl;
    }
    return 0;
}
