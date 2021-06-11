package com.blinkslabs.blinkist.android.challenge.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/blinkslabs/blinkist/android/challenge/util/BLSchedulers;", "", "()V", "schedulers", "Lcom/blinkslabs/blinkist/android/challenge/util/BLSchedulers$RxSchedulers;", "computation", "Lio/reactivex/Scheduler;", "disableTesting", "", "enableTesting", "io", "main", "RxSchedulers", "app_debug"})
public final class BLSchedulers {
    private static com.blinkslabs.blinkist.android.challenge.util.BLSchedulers.RxSchedulers schedulers;
    @org.jetbrains.annotations.NotNull()
    public static final com.blinkslabs.blinkist.android.challenge.util.BLSchedulers INSTANCE = null;
    
    public final void enableTesting() {
    }
    
    public final void disableTesting() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Scheduler computation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Scheduler io() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Scheduler main() {
        return null;
    }
    
    private BLSchedulers() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/blinkslabs/blinkist/android/challenge/util/BLSchedulers$RxSchedulers;", "", "()V", "computation", "Lio/reactivex/Scheduler;", "io", "main", "Default", "Test", "Lcom/blinkslabs/blinkist/android/challenge/util/BLSchedulers$RxSchedulers$Test;", "Lcom/blinkslabs/blinkist/android/challenge/util/BLSchedulers$RxSchedulers$Default;", "app_debug"})
    static abstract class RxSchedulers {
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Scheduler computation();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Scheduler io();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Scheduler main();
        
        private RxSchedulers() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/blinkslabs/blinkist/android/challenge/util/BLSchedulers$RxSchedulers$Test;", "Lcom/blinkslabs/blinkist/android/challenge/util/BLSchedulers$RxSchedulers;", "()V", "computation", "Lio/reactivex/Scheduler;", "io", "main", "app_debug"})
        public static final class Test extends com.blinkslabs.blinkist.android.challenge.util.BLSchedulers.RxSchedulers {
            @org.jetbrains.annotations.NotNull()
            public static final com.blinkslabs.blinkist.android.challenge.util.BLSchedulers.RxSchedulers.Test INSTANCE = null;
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public io.reactivex.Scheduler computation() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public io.reactivex.Scheduler io() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public io.reactivex.Scheduler main() {
                return null;
            }
            
            private Test() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/blinkslabs/blinkist/android/challenge/util/BLSchedulers$RxSchedulers$Default;", "Lcom/blinkslabs/blinkist/android/challenge/util/BLSchedulers$RxSchedulers;", "()V", "computation", "Lio/reactivex/Scheduler;", "io", "main", "app_debug"})
        public static final class Default extends com.blinkslabs.blinkist.android.challenge.util.BLSchedulers.RxSchedulers {
            @org.jetbrains.annotations.NotNull()
            public static final com.blinkslabs.blinkist.android.challenge.util.BLSchedulers.RxSchedulers.Default INSTANCE = null;
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public io.reactivex.Scheduler computation() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public io.reactivex.Scheduler io() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public io.reactivex.Scheduler main() {
                return null;
            }
            
            private Default() {
                super();
            }
        }
    }
}