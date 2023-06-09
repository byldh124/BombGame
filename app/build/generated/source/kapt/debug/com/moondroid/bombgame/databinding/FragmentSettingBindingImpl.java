package com.moondroid.bombgame.databinding;
import com.moondroid.bombgame.R;
import com.moondroid.bombgame.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSettingBindingImpl extends FragmentSettingBinding implements com.moondroid.bombgame.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 10);
        sViewsWithIds.put(R.id.icBack, 11);
        sViewsWithIds.put(R.id.gameWrapper, 12);
        sViewsWithIds.put(R.id.tvGame, 13);
        sViewsWithIds.put(R.id.tvCharacter, 14);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatCheckBox mboundView1;
    @NonNull
    private final androidx.appcompat.widget.AppCompatCheckBox mboundView2;
    @NonNull
    private final androidx.appcompat.widget.AppCompatCheckBox mboundView3;
    @NonNull
    private final android.widget.FrameLayout mboundView5;
    @NonNull
    private final android.widget.FrameLayout mboundView7;
    @NonNull
    private final android.widget.FrameLayout mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView1androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of model.game01.getValue()
            //         is model.game01.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = mboundView1.isChecked();
            // localize variables for thread safety
            // model
            com.moondroid.bombgame.presentation.view.setting.SettingViewModel model = mModel;
            // model != null
            boolean modelJavaLangObjectNull = false;
            // model.game01
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> modelGame01 = null;
            // model.game01.getValue()
            java.lang.Boolean modelGame01GetValue = null;
            // model.game01 != null
            boolean modelGame01JavaLangObjectNull = false;



            modelJavaLangObjectNull = (model) != (null);
            if (modelJavaLangObjectNull) {


                modelGame01 = model.getGame01();

                modelGame01JavaLangObjectNull = (modelGame01) != (null);
                if (modelGame01JavaLangObjectNull) {




                    modelGame01.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of model.game02.getValue()
            //         is model.game02.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = mboundView2.isChecked();
            // localize variables for thread safety
            // model
            com.moondroid.bombgame.presentation.view.setting.SettingViewModel model = mModel;
            // model != null
            boolean modelJavaLangObjectNull = false;
            // model.game02.getValue()
            java.lang.Boolean modelGame02GetValue = null;
            // model.game02
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> modelGame02 = null;
            // model.game02 != null
            boolean modelGame02JavaLangObjectNull = false;



            modelJavaLangObjectNull = (model) != (null);
            if (modelJavaLangObjectNull) {


                modelGame02 = model.getGame02();

                modelGame02JavaLangObjectNull = (modelGame02) != (null);
                if (modelGame02JavaLangObjectNull) {




                    modelGame02.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView3androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of model.game03.getValue()
            //         is model.game03.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = mboundView3.isChecked();
            // localize variables for thread safety
            // model
            com.moondroid.bombgame.presentation.view.setting.SettingViewModel model = mModel;
            // model != null
            boolean modelJavaLangObjectNull = false;
            // model.game03
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> modelGame03 = null;
            // model.game03.getValue()
            java.lang.Boolean modelGame03GetValue = null;
            // model.game03 != null
            boolean modelGame03JavaLangObjectNull = false;



            modelJavaLangObjectNull = (model) != (null);
            if (modelJavaLangObjectNull) {


                modelGame03 = model.getGame03();

                modelGame03JavaLangObjectNull = (modelGame03) != (null);
                if (modelGame03JavaLangObjectNull) {




                    modelGame03.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentSettingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentSettingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (com.airbnb.lottie.LottieAnimationView) bindings[4]
            , (com.airbnb.lottie.LottieAnimationView) bindings[6]
            , (com.airbnb.lottie.LottieAnimationView) bindings[8]
            , (com.google.android.material.appbar.MaterialToolbar) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            );
        this.lottieChar01.setTag(null);
        this.lottieChar02.setTag(null);
        this.lottieChar03.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatCheckBox) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatCheckBox) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (androidx.appcompat.widget.AppCompatCheckBox) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (android.widget.FrameLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView7 = (android.widget.FrameLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (android.widget.FrameLayout) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.moondroid.bombgame.generated.callback.OnClickListener(this, 2);
        mCallback3 = new com.moondroid.bombgame.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.moondroid.bombgame.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.model == variableId) {
            setModel((com.moondroid.bombgame.presentation.view.setting.SettingViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.moondroid.bombgame.presentation.view.setting.SettingViewModel Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeModelCharIndex((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeModelGame03((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeModelGame02((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeModelGame01((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeModelCharIndex(androidx.lifecycle.MutableLiveData<java.lang.Integer> ModelCharIndex, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeModelGame03(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ModelGame03, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeModelGame02(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ModelGame02, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeModelGame01(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ModelGame01, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.moondroid.bombgame.presentation.view.setting.SettingViewModel model = mModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxModelGame01GetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxModelGame02GetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxModelGame03GetValue = false;
        java.lang.Boolean modelGame03GetValue = null;
        java.lang.Integer modelCharIndexGetValue = null;
        boolean modelCharIndexInt1 = false;
        boolean modelCharIndexInt3 = false;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> modelCharIndex = null;
        java.lang.Boolean modelGame02GetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxModelCharIndexGetValue = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> modelGame03 = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> modelGame02 = null;
        boolean modelCharIndexInt2 = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> modelGame01 = null;
        java.lang.Boolean modelGame01GetValue = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (model != null) {
                        // read model.charIndex
                        modelCharIndex = model.getCharIndex();
                    }
                    updateLiveDataRegistration(0, modelCharIndex);


                    if (modelCharIndex != null) {
                        // read model.charIndex.getValue()
                        modelCharIndexGetValue = modelCharIndex.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(model.charIndex.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxModelCharIndexGetValue = androidx.databinding.ViewDataBinding.safeUnbox(modelCharIndexGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(model.charIndex.getValue()) == 1
                    modelCharIndexInt1 = (androidxDatabindingViewDataBindingSafeUnboxModelCharIndexGetValue) == (1);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(model.charIndex.getValue()) == 3
                    modelCharIndexInt3 = (androidxDatabindingViewDataBindingSafeUnboxModelCharIndexGetValue) == (3);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(model.charIndex.getValue()) == 2
                    modelCharIndexInt2 = (androidxDatabindingViewDataBindingSafeUnboxModelCharIndexGetValue) == (2);
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (model != null) {
                        // read model.game03
                        modelGame03 = model.getGame03();
                    }
                    updateLiveDataRegistration(1, modelGame03);


                    if (modelGame03 != null) {
                        // read model.game03.getValue()
                        modelGame03GetValue = modelGame03.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(model.game03.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxModelGame03GetValue = androidx.databinding.ViewDataBinding.safeUnbox(modelGame03GetValue);
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (model != null) {
                        // read model.game02
                        modelGame02 = model.getGame02();
                    }
                    updateLiveDataRegistration(2, modelGame02);


                    if (modelGame02 != null) {
                        // read model.game02.getValue()
                        modelGame02GetValue = modelGame02.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(model.game02.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxModelGame02GetValue = androidx.databinding.ViewDataBinding.safeUnbox(modelGame02GetValue);
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (model != null) {
                        // read model.game01
                        modelGame01 = model.getGame01();
                    }
                    updateLiveDataRegistration(3, modelGame01);


                    if (modelGame01 != null) {
                        // read model.game01.getValue()
                        modelGame01GetValue = modelGame01.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(model.game01.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxModelGame01GetValue = androidx.databinding.ViewDataBinding.safeUnbox(modelGame01GetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            com.moondroid.bombgame.presentation.common.BindingAdapter.playAnim(this.lottieChar01, modelCharIndexInt1);
            com.moondroid.bombgame.presentation.common.BindingAdapter.playAnim(this.lottieChar02, modelCharIndexInt2);
            com.moondroid.bombgame.presentation.common.BindingAdapter.playAnim(this.lottieChar03, modelCharIndexInt3);
            com.moondroid.bombgame.presentation.common.BindingAdapter.setVisible(this.mboundView5, modelCharIndexInt1);
            com.moondroid.bombgame.presentation.common.BindingAdapter.setVisible(this.mboundView7, modelCharIndexInt2);
            com.moondroid.bombgame.presentation.common.BindingAdapter.setVisible(this.mboundView9, modelCharIndexInt3);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.lottieChar01.setOnClickListener(mCallback1);
            this.lottieChar02.setOnClickListener(mCallback2);
            this.lottieChar03.setOnClickListener(mCallback3);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView1, (android.widget.CompoundButton.OnCheckedChangeListener)null, mboundView1androidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView2, (android.widget.CompoundButton.OnCheckedChangeListener)null, mboundView2androidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView3, (android.widget.CompoundButton.OnCheckedChangeListener)null, mboundView3androidCheckedAttrChanged);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView1, androidxDatabindingViewDataBindingSafeUnboxModelGame01GetValue);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView2, androidxDatabindingViewDataBindingSafeUnboxModelGame02GetValue);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView3, androidxDatabindingViewDataBindingSafeUnboxModelGame03GetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // model
                com.moondroid.bombgame.presentation.view.setting.SettingViewModel model = mModel;
                // model != null
                boolean modelJavaLangObjectNull = false;



                modelJavaLangObjectNull = (model) != (null);
                if (modelJavaLangObjectNull) {



                    model.changeChar(2);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // model
                com.moondroid.bombgame.presentation.view.setting.SettingViewModel model = mModel;
                // model != null
                boolean modelJavaLangObjectNull = false;



                modelJavaLangObjectNull = (model) != (null);
                if (modelJavaLangObjectNull) {



                    model.changeChar(3);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // model
                com.moondroid.bombgame.presentation.view.setting.SettingViewModel model = mModel;
                // model != null
                boolean modelJavaLangObjectNull = false;



                modelJavaLangObjectNull = (model) != (null);
                if (modelJavaLangObjectNull) {



                    model.changeChar(1);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model.charIndex
        flag 1 (0x2L): model.game03
        flag 2 (0x3L): model.game02
        flag 3 (0x4L): model.game01
        flag 4 (0x5L): model
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}