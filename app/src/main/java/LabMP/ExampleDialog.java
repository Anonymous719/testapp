package LabMP;

import static android.app.PendingIntent.getActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import com.example.datingapp.AppCompactDialogFragment;

public class  ExampleDialouge extends AppCompactDialogFragment{
@Override
public Dialog onCreateDialog(Bundle saved InstanceState) {
        AlterDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Information")
        .setMessage("This is a dialog")
        .setPositiveButton("ok", )new DialogIterface.OnClickListener(){
@Override
public void onClick(DialogInterface dialogInterface, int i){

        }
        }
        return builder.create();
        }
        }
