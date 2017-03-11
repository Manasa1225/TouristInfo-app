package com.example.bunty.touristinfo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import static android.R.attr.path;
import static android.provider.MediaStore.Files.FileColumns.MEDIA_TYPE_IMAGE;
import static com.example.bunty.touristinfo.SharedPreferenceConstants.KEY_ADD_DESCRIPTION;
import static com.example.bunty.touristinfo.SharedPreferenceConstants.KEY_ADD_TITLE;

public class AddLocalPlace extends AppCompatActivity{
    private static final int CAMERA_REQUEST = 10;
    private static final int GALLERY_REQUEST=20;
    private EditText et_addTitle,et_addDescription;
    private Button bt_addFromCamera,bt_addFromGallery,bt_save;
    private ImageView iv_setImage;
    private SharedPreferenceManager sharedPreferenceManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_local_place);



        et_addTitle= (EditText) findViewById(R.id.et_addTitle);
        et_addDescription= (EditText) findViewById(R.id.et_addDescritpion);
        bt_addFromCamera= (Button) findViewById(R.id.bt_addCamera);
        bt_addFromGallery= (Button) findViewById(R.id.bt_addGallery);
        iv_setImage= (ImageView) findViewById(R.id.iv_image);
        bt_save= (Button) findViewById(R.id.bt_save);


        bt_addFromCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickCamera();
            }
        });
        bt_addFromGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickGallery();

            }
        });
        bt_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickSave();
        }
        });


    }

    private void onClickSave(){
        String addTitle=et_addTitle.getText().toString();
        String addDescription=et_addDescription.getText().toString();

        if(TextUtils.isEmpty(addTitle) && TextUtils.isEmpty(addDescription)){
            Toast.makeText(this, "Title and Description cannot be empty", Toast.LENGTH_LONG).show();
        }
        else {

            sharedPreferenceManager = SharedPreferenceManager.getInstance(AddLocalPlace.this);

            sharedPreferenceManager.addValue("Title", addTitle);
            sharedPreferenceManager.addValue("Description", addDescription);

            et_addTitle.setText("");
            et_addDescription.setText("");
            Toast.makeText(this, "Data saved Successfully", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, FamousPlaces.class);
            startActivity(intent);
        }

    }

private void onClickCamera(){
    Intent intentCamera=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
    //create file to save the captured image
   // File CameraFile=new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),"test.jpg");

 //   Uri tempUri=Uri.fromFile(CameraFile);

   // intentCamera.putExtra(MediaStore.EXTRA_OUTPUT,tempUri);
    startActivityForResult(intentCamera,CAMERA_REQUEST);
    }

    private void onClickGallery(){
//implicit intent to get invoke the gallery
        Intent galleryIntent=new Intent(Intent.ACTION_PICK);
//declare file where to find the data
        File pictureDirectory=Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        String pictureDirectoryPath=pictureDirectory.getPath();
        Uri data=Uri.parse(pictureDirectoryPath);
        //set images type data to intent
        galleryIntent.setDataAndType(data,"image/*");

        startActivityForResult(galleryIntent,GALLERY_REQUEST);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == CAMERA_REQUEST) {

           Bitmap bitmapCameraImage = (Bitmap) data.getExtras().get("data");
            iv_setImage.setImageBitmap(bitmapCameraImage);

        }

                       if (resultCode == RESULT_OK && requestCode == GALLERY_REQUEST) {
                        Bitmap bitmapGalleryimage;
                        //holds of the address of image selected
                        Uri imageUri = data.getData();
                        //inputstream to read the data
                        InputStream inputStream;
                        try {
                            inputStream = getContentResolver().openInputStream(imageUri);
                            bitmapGalleryimage = BitmapFactory.decodeStream(inputStream);
                            iv_setImage.setImageBitmap(bitmapGalleryimage);


                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                           //     bitmapGalleryimage = android.provider.MediaStore.Images.Media.getBitmap(this.getContentResolver(), imageUri);




                        }
                    }
            }









