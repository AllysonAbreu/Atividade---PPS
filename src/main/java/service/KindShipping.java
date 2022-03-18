package service;

import service.frete.Express;
import service.frete.Normal;

public enum KindShipping {

    NORMAL {
        @Override
        public Shipping obtainShipping() {
            return new Normal();
        }
    },

    EXPRESS {
        @Override
        public Shipping obtainShipping() {
            return new Express();
        }
    };

    public abstract Shipping obtainShipping();
}
