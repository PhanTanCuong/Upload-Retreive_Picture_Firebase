package hcmute.edu.vn.firebasde_uploadretreivepictutres;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.lang.ref.Reference;

public class MainActivity extends AppCompatActivity {

    //widgets

    private Button uploadBtn, showAllBtn;
    private ImageView imageView;
    private ProgressBar progressBar;

    //vars
    private DatabaseReference root = FirebaseDatabase.getInstance().getReference("Image");

    private StorageReference reference = FirebaseStorage.getInstance().getReference();
    private Uri imageUri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}