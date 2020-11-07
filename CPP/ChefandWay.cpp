#include <bits/stdc++.h>
#define ll long int
using namespace std;

ll findProduct(ll n, ll k, ll *arr)
{
    ll product = arr[n-1];
    ll i = n-1;
    while (i > 0)
    {
        ll index;
        if (i-k <= 0)
        {
            index = 0;
        }
        else
        {
            ll innerIndex = i - 1;
            ll min = arr[i - 1];
            for (ll j = i - 1; j >= i-k; j--)
            {
                if (min > arr[j])
                {
                    min = arr[j];
                    innerIndex = j;
                }
            }
            index = innerIndex;
        }
        product = (product * arr[index]) % 1000000007;
        i = index;
    }
    return product;
}

int main()
{
    ll n;
    ll k;
    cin >> n;
    cin >> k;
    ll arr[n];
    for (ll i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    cout << findProduct(n, k, arr);
    return 0;
}