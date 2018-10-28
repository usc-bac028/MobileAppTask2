package com.bignerdranch.android.receipt;

import android.support.v4.app.Fragment;

public class ReceiptListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new ReceiptListFragment();
    }
}
