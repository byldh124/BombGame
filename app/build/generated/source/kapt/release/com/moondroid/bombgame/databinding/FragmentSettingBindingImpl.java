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
        sViewsWithIds.put(R.id.toolbar, 11);
        sViewsWithIds.put(R.id.icBack, 12);
        sViewsWithIds.put(R.id.gameWrapper, 13);
        sViewsWithIds.put(R.id.tvGame, 14);
        sViewsWithIds.put(R.id.tvCharacter, 15);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatCheckBox mboundView1;
    @NonNull
    private final android.widget.FrameLayout mboundView10;
    @NonNull
    private final androidx.appcompat.widget.AppCompatCheckBox mboundView2;
    @NonNull
    private final androidx.appcompat.widget.AppCompatCheckBox mboundView3;
    @NonNull
    private final androidx.appcompat.widget.AppCompatCheckBox mboundView4;
    @NonNull
    private final android.widget.FrameLayout mboundView6;
    @NonNull
    private final android.widget.FrameLayout mboundView8;
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
            // Inverse of model.initial.getValue()
            //         is model.initial.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = mboundView1.isChecked();
            // localize variables for thread safety
            // model
            com.moondroid.bombgame.presentation.view.setting.SettingViewModel model = mModel;
            // model.initial
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> modelInitial = null;
            // model.initial.getValue()
            java.lang.Boolean modelInitialGetValue = null;
            // model != null
            boolean modelJavaLangObjectNull = false;
            // model.initial != null
            boolean modelInitialJavaLangObjectNull = false;



            modelJavaLangObjectNull = (model) != (null);
            if (modelJavaLangObjectNull) {


                modelInitial = model.getInitial();

                modelInitialJavaLangObjectNull = (modelInitial) != (null);
                if (modelInitialJavaLangObjectNull) {




                    modelInitial.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of model.association.getValue()
            //         is model.association.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = mboundView2.isChecked();
            // localize variables for thread safety
            // model
            com.moondroid.bombgame.presentation.view.setting.SettingViewModel model = mModel;
            // model != null
            boolean modelJavaLangObjectNull = false;
            // model.association != null
            boolean modelAssociationJavaLangObjectNull = false;
            // model.association
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> modelAssociation = null;
            // model.association.getValue()
            java.lang.Boolean modelAssociationGetValue = null;



            modelJavaLangObjectNull = (model) != (null);
            if (modelJavaLangObjectNull) {


                modelAssociation = model.getAssociation();

                modelAssociationJavaLangObjectNull = (modelAssociation) != (null);
                if (modelAssociationJavaLangObjectNull) {




                    modelAssociation.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView3androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of model.question.getValue()
            //         is model.question.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = mboundView3.isChecked();
            // localize variables for thread safety
            // model
            com.moondroid.bombgame.presentation.view.setting.SettingViewModel model = mModel;
            // model.question
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> modelQuestion = null;
            // model != null
            boolean modelJavaLangObjectNull = false;
            // model.question != null
            boolean modelQuestionJavaLangObjectNull = false;
            // model.question.getValue()
            java.lang.Boolean modelQuestionGetValue = null;



            modelJavaLangObjectNull = (model) != (null);
            if (modelJavaLangObjectNull) {


                modelQuestion = model.getQuestion();

                modelQuestionJavaLangObjectNull = (modelQuestion) != (null);
                if (modelQuestionJavaLangObjectNull) {




                    modelQuestion.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of model.lastWord.getValue()
            //         is model.lastWord.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = mboundView4.isChecked();
            // localize variables for thread safety
            // model
            com.moondroid.bombgame.presentation.view.setting.SettingViewModel model = mModel;
            // model.lastWord != null
            boolean modelLastWordJavaLangObjectNull = false;
            // model.lastWord
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> modelLastWord = null;
            // model != null
            boolean modelJavaLangObjectNull = false;
            // model.lastWord.getValue()
            java.lang.Boolean modelLastWordGetValue = null;



            modelJavaLangObjectNull = (model) != (null);
            if (modelJavaLangObjectNull) {


                modelLastWord = model.getLastWord();

                modelLastWordJavaLangObjectNull = (modelLastWord) != (null);
                if (modelLastWordJavaLangObjectNull) {




                    modelLastWord.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentSettingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentSettingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[13]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[12]
            , (com.airbnb.lottie.LottieAnimationView) bindings[5]
            , (com.airbnb.lottie.LottieAnimationView) bindings[7]
            , (com.airbnb.lottie.LottieAnimationView) bindings[9]
            , (com.google.android.material.appbar.MaterialToolbar) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[15]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            );
        this.lottieChar01.setTag(null);
        this.lottieChar02.setTag(null);
        this.lottieChar03.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatCheckBox) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.FrameLayout) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatCheckBox) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (androidx.appcompat.widget.AppCompatCheckBox) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (androidx.appcompat.widget.AppCompatCheckBox) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (android.widget.FrameLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView8 = (android.widget.FrameLayout) bindings[8];
        this.mboundView8.setTag(null);
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
                mDirtyFlags = 0x40L;
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
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeModelInitial((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeModelCharIndex((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeModelQuestion((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeModelAssociation((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeModelLastWord((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeModelInitial(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ModelInitial, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeModelCharIndex(androidx.lifecycle.MutableLiveData<java.lang.Integer> ModelCharIndex, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeModelQuestion(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ModelQuestion, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeModelAssociation(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ModelAssociation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeModelLastWord(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ModelLastWord, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxModelAssociationGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> modelInitial = null;
        java.lang.Boolean modelInitialGetValue = null;
        java.lang.Integer modelCharIndexGetValue = null;
        boolean modelCharIndexInt1 = false;
        boolean modelCharIndexInt3 = false;
        java.lang.Boolean modelQuestionGetValue = null;
        java.lang.Boolean modelAssociationGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> modelCharIndex = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxModelLastWordGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> modelQuestion = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxModelQuestionGetValue = false;
        int androidxDatabindingViewDataBindingSafeUnboxModelCharIndexGetValue = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> modelAssociation = null;
        java.lang.Boolean modelLastWordGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> modelLastWord = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxModelInitialGetValue = false;
        boolean modelCharIndexInt2 = false;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (model != null) {
                        // read model.initial
                        modelInitial = model.getInitial();
                    }
                    updateLiveDataRegistration(0, modelInitial);


                    if (modelInitial != null) {
                        // read model.initial.getValue()
                        modelInitialGetValue = modelInitial.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(model.initial.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxModelInitialGetValue = androidx.databinding.ViewDataBinding.safeUnbox(modelInitialGetValue);
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (model != null) {
                        // read model.charIndex
                        modelCharIndex = model.getCharIndex();
                    }
                    updateLiveDataRegistration(1, modelCharIndex);


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
            if ((dirtyFlags & 0x64L) != 0) {

                    if (model != null) {
                        // read model.question
                        modelQuestion = model.getQuestion();
                    }
                    updateLiveDataRegistration(2, modelQuestion);


                    if (modelQuestion != null) {
                        // read model.question.getValue()
                        modelQuestionGetValue = modelQuestion.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(model.question.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxModelQuestionGetValue = androidx.databinding.ViewDataBinding.safeUnbox(modelQuestionGetValue);
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (model != null) {
                        // read model.association
                        modelAssociation = model.getAssociation();
                    }
                    updateLiveDataRegistration(3, modelAssociation);


                    if (modelAssociation != null) {
                        // read model.association.getValue()
                        modelAssociationGetValue = modelAssociation.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(model.association.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxModelAssociationGetValue = androidx.databinding.ViewDataBinding.safeUnbox(modelAssociationGetValue);
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (model != null) {
                        // read model.lastWord
                        modelLastWord = model.getLastWord();
                    }
                    updateLiveDataRegistration(4, modelLastWord);


                    if (modelLastWord != null) {
                        // read model.lastWord.getValue()
                        modelLastWordGetValue = modelLastWord.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(model.lastWord.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxModelLastWordGetValue = androidx.databinding.ViewDataBinding.safeUnbox(modelLastWordGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            com.moondroid.bombgame.presentation.common.BindingAdapter.playAnim(this.lottieChar01, modelCharIndexInt1);
            com.moondroid.bombgame.presentation.common.BindingAdapter.playAnim(this.lottieChar02, modelCharIndexInt2);
            com.moondroid.bombgame.presentation.common.BindingAdapter.playAnim(this.lottieChar03, modelCharIndexInt3);
            com.moondroid.bombgame.presentation.common.BindingAdapter.setVisible(this.mboundView10, modelCharIndexInt3);
            com.moondroid.bombgame.presentation.common.BindingAdapter.setVisible(this.mboundView6, modelCharIndexInt1);
            com.moondroid.bombgame.presentation.common.BindingAdapter.setVisible(this.mboundView8, modelCharIndexInt2);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.lottieChar01.setOnClickListener(mCallback1);
            this.lottieChar02.setOnClickListener(mCallback2);
            this.lottieChar03.setOnClickListener(mCallback3);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView1, (android.widget.CompoundButton.OnCheckedChangeListener)null, mboundView1androidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView2, (android.widget.CompoundButton.OnCheckedChangeListener)null, mboundView2androidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView3, (android.widget.CompoundButton.OnCheckedChangeListener)null, mboundView3androidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView4, (android.widget.CompoundButton.OnCheckedChangeListener)null, mboundView4androidCheckedAttrChanged);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView1, androidxDatabindingViewDataBindingSafeUnboxModelInitialGetValue);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView2, androidxDatabindingViewDataBindingSafeUnboxModelAssociationGetValue);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView3, androidxDatabindingViewDataBindingSafeUnboxModelQuestionGetValue);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView4, androidxDatabindingViewDataBindingSafeUnboxModelLastWordGetValue);
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
        flag 0 (0x1L): model.initial
        flag 1 (0x2L): model.charIndex
        flag 2 (0x3L): model.question
        flag 3 (0x4L): model.association
        flag 4 (0x5L): model.lastWord
        flag 5 (0x6L): model
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}