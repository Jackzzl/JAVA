#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
//�žų˷������׿�� 
int main() {
	int n,m;
	cout<<"�žų˷���"<<endl;
	for(n=1;n<10;n++){
		for(m=1;m<=n;m++){
		if(m*n>=10)
		cout<<m<<"*"<<n<<"="<<m*n<<" ";
		else
		cout<<m<<"*"<<n<<"="<<m*n<<"  ";
		}
		cout<<endl;
	}
	return 0; 
}
