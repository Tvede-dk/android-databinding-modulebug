package modulebug.databinding.test.com.mylibrary;

import android.os.Bundle;
import android.support.annotation.Nullable;

import modulebug.databinding.test.com.mylibrary.databinding.TestLayoutBinding;

/**
 * Created by Kasper Tvede on 26-08-2017.
 */

public abstract class TheMagic<T> extends AbstractActivity<TestLayoutBinding> {

    private T fragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = TestLayoutBinding.inflate(getLayoutInflater());
    }

}
