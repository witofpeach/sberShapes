import java.util.HashMap;

public class Buckets extends HashMap<BucketSpecsPair, Bucket> {
    public boolean add(Figure figure) {
        BucketSpecsPair inputSpecs = new BucketSpecsPair(figure.getShape(), figure.getColor());
        if (this.containsKey(inputSpecs)) {
            return this.get(inputSpecs).add(figure);
        } else {
            Bucket bucket = new Bucket();
            bucket.bucketSpecsPair = inputSpecs;
            this.put(inputSpecs, bucket);
            return bucket.add(figure);
        }
    }
}
