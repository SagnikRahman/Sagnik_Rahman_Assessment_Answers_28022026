package Enumeration;

public enum OrderStatus {
    PLACED(1) {
        @Override
        public boolean canTransitionTo(OrderStatus next) {
            return next == SHIPPED || next == CANCELLED;
        }
    },
    SHIPPED(2) {
        @Override
        public boolean canTransitionTo(OrderStatus next) {
            return next == DELIVERED;
        }
    },
    DELIVERED(3) {
        @Override
        public boolean canTransitionTo(OrderStatus next) {
            return false; 
        }
    },
    CANCELLED(0) {
        @Override
        public boolean canTransitionTo(OrderStatus next) {
            return false;
        }
    };
	
    private final int code;
    OrderStatus(int code) { 
    	this.code = code; 
    }
    
    public int getCode() {
        return code;
    }
    
    public abstract boolean canTransitionTo(OrderStatus next);
}