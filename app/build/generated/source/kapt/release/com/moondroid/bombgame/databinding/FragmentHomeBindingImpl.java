package com.moondroid.bombgame.databinding;
import com.moondroid.bombgame.R;
import com.moondroid.bombgame.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.header, 8);
        sViewsWithIds.put(R.id.lottieWrapper, 9);
        sViewsWithIds.put(R.id.adView, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.gms.ads.AdView) bindings[10]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[8]
            , (com.airbnb.lottie.LottieAnimationView) bindings[5]
            , (com.airbnb.lottie.LottieAnimationView) bindings[4]
            , (com.airbnb.lottie.LottieAnimationView) bindings[6]
            , (android.widget.FrameLayout) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            );
        this.lottieBomb.setTag(null);
        this.lottieCountDown.setTag(null);
        this.lottieExplosion.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvDescript.setTag(null);
        this.tvQuiz.setTag(null);
        this.tvTimer.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.status == variableId) {
            setStatus((com.moondroid.bombgame.presentation.view.home.HomeFragment.GameStatus) variable);
        }
        else if (BR.type == variableId) {
            setType((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setStatus(@Nullable com.moondroid.bombgame.presentation.view.home.HomeFragment.GameStatus Status) {
        this.mStatus = Status;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.status);
        super.requestRebind();
    }
    public void setType(@Nullable java.lang.Integer Type) {
        this.mType = Type;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.type);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.moondroid.bombgame.presentation.view.home.HomeFragment.GameStatus status = mStatus;
        boolean statusGameStatusBOMB = false;
        boolean statusGameStatusEXPLOSION = false;
        java.lang.Integer type = mType;
        boolean statusGameStatusBOMBBooleanTrueStatusGameStatusEXPLOSION = false;
        int androidxDatabindingViewDataBindingSafeUnboxType = 0;
        boolean statusGameStatusCOUNT = false;

        if ((dirtyFlags & 0x5L) != 0) {



                // read status == GameStatus.BOMB
                statusGameStatusBOMB = (status) == (com.moondroid.bombgame.presentation.view.home.HomeFragment.GameStatus.BOMB);
                // read status == GameStatus.EXPLOSION
                statusGameStatusEXPLOSION = (status) == (com.moondroid.bombgame.presentation.view.home.HomeFragment.GameStatus.EXPLOSION);
                // read status == GameStatus.COUNT
                statusGameStatusCOUNT = (status) == (com.moondroid.bombgame.presentation.view.home.HomeFragment.GameStatus.COUNT);
            if((dirtyFlags & 0x5L) != 0) {
                if(statusGameStatusBOMB) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(type)
                androidxDatabindingViewDataBindingSafeUnboxType = androidx.databinding.ViewDataBinding.safeUnbox(type);
        }
        // batch finished

        if ((dirtyFlags & 0x5L) != 0) {

                // read status == GameStatus.BOMB ? true : status == GameStatus.EXPLOSION
                statusGameStatusBOMBBooleanTrueStatusGameStatusEXPLOSION = ((statusGameStatusBOMB) ? (true) : (statusGameStatusEXPLOSION));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.moondroid.bombgame.presentation.common.BindingAdapter.setVisible(this.lottieBomb, statusGameStatusBOMB);
            com.moondroid.bombgame.presentation.common.BindingAdapter.setVisible(this.lottieCountDown, statusGameStatusCOUNT);
            com.moondroid.bombgame.presentation.common.BindingAdapter.setVisible(this.lottieExplosion, statusGameStatusEXPLOSION);
            com.moondroid.bombgame.presentation.common.BindingAdapter.setVisible(this.tvTimer, statusGameStatusBOMBBooleanTrueStatusGameStatusEXPLOSION);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.moondroid.bombgame.presentation.common.BindingAdapter.setTypeDescription(this.tvDescript, androidxDatabindingViewDataBindingSafeUnboxType);
            com.moondroid.bombgame.presentation.common.BindingAdapter.setTypeQuiz(this.tvQuiz, androidxDatabindingViewDataBindingSafeUnboxType);
            com.moondroid.bombgame.presentation.common.BindingAdapter.setTypeTitle(this.tvTitle, androidxDatabindingViewDataBindingSafeUnboxType);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): status
        flag 1 (0x2L): type
        flag 2 (0x3L): null
        flag 3 (0x4L): status == GameStatus.BOMB ? true : status == GameStatus.EXPLOSION
        flag 4 (0x5L): status == GameStatus.BOMB ? true : status == GameStatus.EXPLOSION
    flag mapping end*/
    //end
}