package chris.mh_alpha;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewStub;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    View mainPage;
    View buildingPage;
    View groundsPage;
    View roofPage;
    View exteriorPage;
    View carportPage;
    View kitchenPage;
    View laundryPage;
    View bathroomsPage;
    View roomsPage;
    View interiorPage;
    View plumbingPage;
    View electricalPage;
    View poolPage;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.building_button) {
            switchViews(1);
        } else if (id == R.id.grounds_button) {
            switchViews(2);
        } else if (id == R.id.roof_button) {
            switchViews(3);
        } else if (id == R.id.exterior_button) {
            switchViews(4);
        } else if (id == R.id.carport_button) {
            switchViews(5);
        } else if (id == R.id.kitchen_button) {
            switchViews(6);
        }else if (id == R.id.laundry_button) {
            switchViews(7);
        }else if (id == R.id.bathrooms_button) {
            switchViews(8);
        }else if (id == R.id.rooms_button) {
            switchViews(9);
        }else if (id == R.id.interior_button) {
            switchViews(10);
        }else if (id == R.id.plumbing_button) {
            switchViews(11);
        }else if (id == R.id.electrical_button) {
            switchViews(12);
        }else if (id == R.id.pool_button) {
            switchViews(13);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void createViews() {
        ViewStub stub = (ViewStub) findViewById(R.id.main_page);
        stub.setLayoutResource(R.layout.content_main);
        mainPage = stub.inflate();

        stub = (ViewStub) findViewById(R.id.building_page);
        stub.setLayoutResource(R.layout.content_building);
        buildingPage = stub.inflate();
        buildingPage.setVisibility(View.GONE);

        stub = (ViewStub) findViewById(R.id.grounds_page);
        stub.setLayoutResource(R.layout.content_grounds);
        groundsPage = stub.inflate();
        groundsPage.setVisibility(View.GONE);

        stub = (ViewStub) findViewById(R.id.roof_page);
        stub.setLayoutResource(R.layout.content_roof);
        roofPage = stub.inflate();
        roofPage.setVisibility(View.GONE);

        stub = (ViewStub) findViewById(R.id.exterior_page);
        stub.setLayoutResource(R.layout.content_exterior);
        exteriorPage = stub.inflate();
        exteriorPage.setVisibility(View.GONE);

        stub = (ViewStub) findViewById(R.id.carport_page);
        stub.setLayoutResource(R.layout.content_carport);
        carportPage = stub.inflate();
        carportPage.setVisibility(View.GONE);

        stub = (ViewStub) findViewById(R.id.kitchen_page);
        stub.setLayoutResource(R.layout.content_kitchen);
        kitchenPage = stub.inflate();
        kitchenPage.setVisibility(View.GONE);

        stub = (ViewStub) findViewById(R.id.laundry_page);
        stub.setLayoutResource(R.layout.content_laundry);
        laundryPage = stub.inflate();
        laundryPage.setVisibility(View.GONE);

        stub = (ViewStub) findViewById(R.id.bathrooms_page);
        stub.setLayoutResource(R.layout.content_bathrooms);
        bathroomsPage = stub.inflate();
        bathroomsPage.setVisibility(View.GONE);

        stub = (ViewStub) findViewById(R.id.rooms_page);
        stub.setLayoutResource(R.layout.content_rooms);
        roomsPage = stub.inflate();
        roomsPage.setVisibility(View.GONE);

        stub = (ViewStub) findViewById(R.id.interior_page);
        stub.setLayoutResource(R.layout.content_interior);
        interiorPage = stub.inflate();
        interiorPage.setVisibility(View.GONE);

        stub = (ViewStub) findViewById(R.id.plumbing_page);
        stub.setLayoutResource(R.layout.content_plumbing);
        plumbingPage = stub.inflate();
        plumbingPage.setVisibility(View.GONE);

        stub = (ViewStub) findViewById(R.id.electrical_page);
        stub.setLayoutResource(R.layout.content_electrical);
        electricalPage = stub.inflate();
        electricalPage.setVisibility(View.GONE);

        stub = (ViewStub) findViewById(R.id.pool_page);
        stub.setLayoutResource(R.layout.content_pool);
        poolPage = stub.inflate();
        poolPage.setVisibility(View.GONE);

    }

    public void switchViews(int page) {
        switch (page) {
            case 1: {
                mainPage.setVisibility(View.GONE);
                buildingPage.setVisibility(View.VISIBLE);
                groundsPage.setVisibility(View.GONE);
                roofPage.setVisibility(View.GONE);
                exteriorPage.setVisibility(View.GONE);
                carportPage.setVisibility(View.GONE);
                kitchenPage.setVisibility(View.GONE);
                laundryPage.setVisibility(View.GONE);
                bathroomsPage.setVisibility(View.GONE);
                roomsPage.setVisibility(View.GONE);
                interiorPage.setVisibility(View.GONE);
                plumbingPage.setVisibility(View.GONE);
                electricalPage.setVisibility(View.GONE);
                poolPage.setVisibility(View.GONE);
                navigationView.setCheckedItem(R.id.building_button);

            }
            break;
            case 2: {
                mainPage.setVisibility(View.GONE);
                buildingPage.setVisibility(View.GONE);
                groundsPage.setVisibility(View.VISIBLE);
                roofPage.setVisibility(View.GONE);
                exteriorPage.setVisibility(View.GONE);
                carportPage.setVisibility(View.GONE);
                kitchenPage.setVisibility(View.GONE);
                laundryPage.setVisibility(View.GONE);
                bathroomsPage.setVisibility(View.GONE);
                roomsPage.setVisibility(View.GONE);
                interiorPage.setVisibility(View.GONE);
                plumbingPage.setVisibility(View.GONE);
                electricalPage.setVisibility(View.GONE);
                poolPage.setVisibility(View.GONE);
                navigationView.setCheckedItem(R.id.grounds_button);
            }
            break;
            case 3: {
                mainPage.setVisibility(View.GONE);
                buildingPage.setVisibility(View.GONE);
                groundsPage.setVisibility(View.GONE);
                roofPage.setVisibility(View.VISIBLE);
                exteriorPage.setVisibility(View.GONE);
                carportPage.setVisibility(View.GONE);
                kitchenPage.setVisibility(View.GONE);
                laundryPage.setVisibility(View.GONE);
                bathroomsPage.setVisibility(View.GONE);
                roomsPage.setVisibility(View.GONE);
                interiorPage.setVisibility(View.GONE);
                plumbingPage.setVisibility(View.GONE);
                electricalPage.setVisibility(View.GONE);
                poolPage.setVisibility(View.GONE);
                navigationView.setCheckedItem(R.id.roof_button);
            }
            break;
            case 4: {
                mainPage.setVisibility(View.GONE);
                buildingPage.setVisibility(View.GONE);
                groundsPage.setVisibility(View.GONE);
                roofPage.setVisibility(View.GONE);
                exteriorPage.setVisibility(View.VISIBLE);
                carportPage.setVisibility(View.GONE);
                kitchenPage.setVisibility(View.GONE);
                laundryPage.setVisibility(View.GONE);
                bathroomsPage.setVisibility(View.GONE);
                roomsPage.setVisibility(View.GONE);
                interiorPage.setVisibility(View.GONE);
                plumbingPage.setVisibility(View.GONE);
                electricalPage.setVisibility(View.GONE);
                poolPage.setVisibility(View.GONE);
                navigationView.setCheckedItem(R.id.exterior_button);
            }
            break;
            case 5:{
                mainPage.setVisibility(View.GONE);
                buildingPage.setVisibility(View.GONE);
                groundsPage.setVisibility(View.GONE);
                roofPage.setVisibility(View.GONE);
                exteriorPage.setVisibility(View.GONE);
                carportPage.setVisibility(View.VISIBLE);
                kitchenPage.setVisibility(View.GONE);
                laundryPage.setVisibility(View.GONE);
                bathroomsPage.setVisibility(View.GONE);
                roomsPage.setVisibility(View.GONE);
                interiorPage.setVisibility(View.GONE);
                plumbingPage.setVisibility(View.GONE);
                electricalPage.setVisibility(View.GONE);
                poolPage.setVisibility(View.GONE);
                navigationView.setCheckedItem(R.id.carport_button);
            }
            break;
            case 6:{
                mainPage.setVisibility(View.GONE);
                buildingPage.setVisibility(View.GONE);
                groundsPage.setVisibility(View.GONE);
                roofPage.setVisibility(View.GONE);
                exteriorPage.setVisibility(View.GONE);
                carportPage.setVisibility(View.GONE);
                kitchenPage.setVisibility(View.VISIBLE);
                laundryPage.setVisibility(View.GONE);
                bathroomsPage.setVisibility(View.GONE);
                roomsPage.setVisibility(View.GONE);
                interiorPage.setVisibility(View.GONE);
                plumbingPage.setVisibility(View.GONE);
                electricalPage.setVisibility(View.GONE);
                poolPage.setVisibility(View.GONE);
                navigationView.setCheckedItem(R.id.kitchen_button);
            }
            break;
            case 7:{
                mainPage.setVisibility(View.GONE);
                buildingPage.setVisibility(View.GONE);
                groundsPage.setVisibility(View.GONE);
                roofPage.setVisibility(View.GONE);
                exteriorPage.setVisibility(View.GONE);
                carportPage.setVisibility(View.GONE);
                kitchenPage.setVisibility(View.GONE);
                laundryPage.setVisibility(View.VISIBLE);
                bathroomsPage.setVisibility(View.GONE);
                roomsPage.setVisibility(View.GONE);
                interiorPage.setVisibility(View.GONE);
                plumbingPage.setVisibility(View.GONE);
                electricalPage.setVisibility(View.GONE);
                poolPage.setVisibility(View.GONE);
                navigationView.setCheckedItem(R.id.laundry_button);
            }
            break;
            case 8:{
                mainPage.setVisibility(View.GONE);
                buildingPage.setVisibility(View.GONE);
                groundsPage.setVisibility(View.GONE);
                roofPage.setVisibility(View.GONE);
                exteriorPage.setVisibility(View.GONE);
                carportPage.setVisibility(View.GONE);
                kitchenPage.setVisibility(View.GONE);
                laundryPage.setVisibility(View.GONE);
                bathroomsPage.setVisibility(View.VISIBLE);
                roomsPage.setVisibility(View.GONE);
                interiorPage.setVisibility(View.GONE);
                plumbingPage.setVisibility(View.GONE);
                electricalPage.setVisibility(View.GONE);
                poolPage.setVisibility(View.GONE);
                navigationView.setCheckedItem(R.id.bathrooms_button);
            }
            break;
            case 9:{
                mainPage.setVisibility(View.GONE);
                buildingPage.setVisibility(View.GONE);
                groundsPage.setVisibility(View.GONE);
                roofPage.setVisibility(View.GONE);
                exteriorPage.setVisibility(View.GONE);
                carportPage.setVisibility(View.GONE);
                kitchenPage.setVisibility(View.GONE);
                laundryPage.setVisibility(View.GONE);
                bathroomsPage.setVisibility(View.GONE);
                roomsPage.setVisibility(View.VISIBLE);
                interiorPage.setVisibility(View.GONE);
                plumbingPage.setVisibility(View.GONE);
                electricalPage.setVisibility(View.GONE);
                poolPage.setVisibility(View.GONE);
                navigationView.setCheckedItem(R.id.rooms_button);
            }
            break;
            case 10:{
                mainPage.setVisibility(View.GONE);
                buildingPage.setVisibility(View.GONE);
                groundsPage.setVisibility(View.GONE);
                roofPage.setVisibility(View.GONE);
                exteriorPage.setVisibility(View.GONE);
                carportPage.setVisibility(View.GONE);
                kitchenPage.setVisibility(View.GONE);
                laundryPage.setVisibility(View.GONE);
                bathroomsPage.setVisibility(View.GONE);
                roomsPage.setVisibility(View.GONE);
                interiorPage.setVisibility(View.VISIBLE);
                plumbingPage.setVisibility(View.GONE);
                electricalPage.setVisibility(View.GONE);
                poolPage.setVisibility(View.GONE);
                navigationView.setCheckedItem(R.id.interior_button);
            }
            break;
            case 11:{
                mainPage.setVisibility(View.GONE);
                buildingPage.setVisibility(View.GONE);
                groundsPage.setVisibility(View.GONE);
                roofPage.setVisibility(View.GONE);
                exteriorPage.setVisibility(View.GONE);
                carportPage.setVisibility(View.GONE);
                kitchenPage.setVisibility(View.GONE);
                laundryPage.setVisibility(View.GONE);
                bathroomsPage.setVisibility(View.GONE);
                roomsPage.setVisibility(View.GONE);
                interiorPage.setVisibility(View.GONE);
                plumbingPage.setVisibility(View.VISIBLE);
                electricalPage.setVisibility(View.GONE);
                poolPage.setVisibility(View.GONE);
                navigationView.setCheckedItem(R.id.plumbing_button);
            }
            break;
            case 12:{
                mainPage.setVisibility(View.GONE);
                buildingPage.setVisibility(View.GONE);
                groundsPage.setVisibility(View.GONE);
                roofPage.setVisibility(View.GONE);
                exteriorPage.setVisibility(View.GONE);
                carportPage.setVisibility(View.GONE);
                kitchenPage.setVisibility(View.GONE);
                laundryPage.setVisibility(View.GONE);
                bathroomsPage.setVisibility(View.GONE);
                roomsPage.setVisibility(View.GONE);
                interiorPage.setVisibility(View.GONE);
                plumbingPage.setVisibility(View.GONE);
                electricalPage.setVisibility(View.VISIBLE);
                poolPage.setVisibility(View.GONE);
                navigationView.setCheckedItem(R.id.electrical_button);
            }
            break;
            case 13:{
                mainPage.setVisibility(View.GONE);
                buildingPage.setVisibility(View.GONE);
                groundsPage.setVisibility(View.GONE);
                roofPage.setVisibility(View.GONE);
                exteriorPage.setVisibility(View.GONE);
                carportPage.setVisibility(View.GONE);
                kitchenPage.setVisibility(View.GONE);
                laundryPage.setVisibility(View.GONE);
                bathroomsPage.setVisibility(View.GONE);
                roomsPage.setVisibility(View.GONE);
                interiorPage.setVisibility(View.GONE);
                plumbingPage.setVisibility(View.GONE);
                electricalPage.setVisibility(View.GONE);
                poolPage.setVisibility(View.VISIBLE);
                navigationView.setCheckedItem(R.id.pool_button);
            }
            break;
        }
    }

    public void newform(View V){
        switchViews(1);
    }
    public void open(View V){

    }
}
