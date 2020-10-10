#include <bits/stdc++.h>
#define ll long long int
using namespace std;

ll getValue(ll n) 
{ 
	ll i=1;
	while(i<=n) {
		i*=2;
	}
	i/=2;
	return i;
} 

ll easyfibo(ll length) {
	ll number = getValue(length);
	return number;
}

int main() {
	int fib[60];
	fib[0] = 0;
	fib[1] = 1;
	for(int i = 2; i < 60; i++) {
		fib[i] = (fib[i-1] + fib[i-2]) % 10;
	}
	ll testCases;
	cin >> testCases;
	while(testCases--) {
		ll temp;
		cin >> temp;
		cout << fib[(easyfibo(temp) - 1) % 60] << endl;
	}
	return 0;
}