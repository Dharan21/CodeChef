#include <bits/stdc++.h>
#define ll long long int
using namespace std;

int main()
{
    ll t;
    cin >> t;
    while (t--)
    {
        int h, p;
        cin >> h >> p;
        while(h > 0 && p > 0) {
            h -= p;
            p >>= 1;
        }
        if (h > 0) {
            cout << "0" << endl;
        } else {
            cout << "1" << endl;
        }
    }
    return 0;
}