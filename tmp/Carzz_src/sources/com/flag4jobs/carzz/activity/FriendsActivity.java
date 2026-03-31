package com.flag4jobs.carzz.activity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.flag4jobs.carzz.R;
import com.flag4jobs.carzz.adapter.FriendsRecyclerAdapter;
import com.flag4jobs.carzz.internal.Contact;
import com.flag4jobs.carzz.internal.ContactManager;
import com.flag4jobs.carzz.internal.PermissionHelper;
import com.flag4jobs.carzz.net.NetClient;
import com.flag4jobs.carzz.net.NetHTTPResponse;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class FriendsActivity extends AppCompatActivity {
    private static final String TAG = "FriendsActivity";
    private ImageView addContactImageView;
    private ArrayList<Contact> contacts;
    private RecyclerView recyclerView;
    private ImageView refreshContactsImageView;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_friends);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), new OnApplyWindowInsetsListener() { // from class: com.flag4jobs.carzz.activity.FriendsActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return FriendsActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.recyclerView = (RecyclerView) findViewById(R.id.contactViewRecyclerView);
        this.refreshContactsImageView = (ImageView) findViewById(R.id.contactViewRefreshContactsImageView);
        ImageView imageView = (ImageView) findViewById(R.id.contactViewAddContactImageView);
        this.addContactImageView = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.carzz.activity.FriendsActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onCreate$1(view);
            }
        });
        this.refreshContactsImageView.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.carzz.activity.FriendsActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onCreate$2(view);
            }
        });
        PermissionHelper.requestContactsPermission(this);
        enableRecyclerView();
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(View view) {
        handleAddContact();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$2(View view) {
        enableRecyclerView();
    }

    private void enableRecyclerView() {
        this.contacts = new ArrayList<>();
        NetHTTPResponse friends = new NetClient(this).getFriends();
        if (friends == null) {
            Toast.makeText(this, "An error occurred.", 0).show();
            return;
        }
        if (!friends.isOk()) {
            Toast.makeText(this, friends.getMessage(), 0).show();
            return;
        }
        ArrayList<String> allPhoneNumbers = ContactManager.getAllPhoneNumbers(this);
        JSONArray dataArray = friends.getDataArray();
        for (int i = 0; i < dataArray.length(); i++) {
            try {
                String string = dataArray.getString(i);
                this.contacts.add(new Contact(string, true));
                allPhoneNumbers.remove(string);
            } catch (Exception unused) {
                Toast.makeText(this, "An error occurred.", 0).show();
                return;
            }
        }
        Iterator<String> it = allPhoneNumbers.iterator();
        while (it.hasNext()) {
            this.contacts.add(new Contact(it.next(), false));
        }
        FriendsRecyclerAdapter friendsRecyclerAdapter = new FriendsRecyclerAdapter(this, this.contacts);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.recyclerView.setAdapter(friendsRecyclerAdapter);
    }

    private void handleAddContact() {
        startActivity(new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI));
    }
}
