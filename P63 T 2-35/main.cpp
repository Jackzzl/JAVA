#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
//�žų˷������׿�� 
int main() {
	int n,m;
	cout<<"�žų˷���"<<endl;
	for(n=1;n=9;++n){
		for(m=1;m=9;++m){
		if(m*n>10)
		cout<<n<<"*"<<m<<"="<<n*m<<" ";
		else
		cout<<n<<"*"<<m<<"="<<n*m;
		cout<<endl; 
		}
	}
	return 0; 
}	
