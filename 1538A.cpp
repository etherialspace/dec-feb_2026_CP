#include <iostream>
using namespace std;

int main() {
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        vector<int> a(n+1);
        int mn=1, mx=n, p1=0, p2=0;
        for(int i=1; i<=n; i++) {
            cin >> a[i];
            if(a[i]==mn) p1=i;
            if(a[i]==mx) p2=i;
        }
        int ans = 2 * max(p1, p2) - 1;
        if((p1==1 && p2==n) || (p1==n && p2==1)) ans = 2;
        cout << min(ans, 2*min(p1,p2)) << endl;  // covers both ends case
    }
}


// 5
// 5
// 1 5 4 3 2
// 8
// 2 1 3 4 5 6 8 7
// 8
// 4 2 3 1 8 6 7 5
// 4
// 3 4 2 1
// 4
// 2 3 1 4
