public class Garage {
    public void replaceEngine(Vehicle vehicle,String model,int mileage) throws GarageException {
        try {
            vehicle.setModel(model);
            vehicle.setMileage(mileage);
        }
        catch (NullPointerException e) {
            throw new GarageException(e.toString(),e);
        }
        catch (Exception e) {
            throw new GarageException("exception while trying to replace engine",e);
        }

    }
}
