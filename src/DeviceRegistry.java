import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.*;

class Device{

}
public class DeviceRegistry {
    private Map<String, Device> devices = new HashMap<>();
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    // Multiple threads can read simultaneously
    public Device getDevice(String id) {
        lock.readLock().lock();
        try {
            return devices.get(id);   // safe, no modifications
        } finally {
            lock.readLock().unlock();
        }
    }

    // Only one thread can write, blocks all readers
    public void updateDevice(String id, Device device) {
        lock.writeLock().lock();
        try {
            devices.put(id, device);
        } finally {
            lock.writeLock().unlock();
        }
    }
}