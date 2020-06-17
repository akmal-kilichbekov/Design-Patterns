package WeatherStation;

public interface Subject {
   public void registerObserver(Object o);
   
   public void unRegisterObserver(Object o);
   
   public void notifyChanges();
}
