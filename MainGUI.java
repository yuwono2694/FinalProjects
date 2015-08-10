/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AppPackages;

import AppPackage.AnimationClass;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jl.player.Player;

/**
 *
 * @author user
 */
public class MainGUI extends javax.swing.JFrame {

    FileInputStream FIS;
    BufferedInputStream BIS;
    
    public Player player;
    public long pauseLocation;
    public long songTotalLength;
    
    public String fileLocation;
    public String songtitle;
    
    int i;
    
    int recentSong;
    
    int errorHandling;
    int up = 0;
    
    MainClass MC = new MainClass();
    /**
     * Creates new form MainGUI
     */
    
    HelpFrame helpFrame = new HelpFrame();
    
    int xMouse;
    int yMouse;
    
    String song1 = "C:\\Users\\Hp\\Desktop\\Music Video\\Sam Tsui Video\\Song\\Sam Tsui - Born This Way.mp3";
    String song2 = "C:\\Users\\Hp\\Desktop\\Music Video\\Sam Tsui Video\\Song\\Sam Tsui - Bring Me The Night.mp3";
    String song3 = "C:\\Users\\Hp\\Desktop\\Music Video\\Sam Tsui Video\\Song\\Sam Tsui - DJ Got Us Falling In Love.mp3";
    String song4 = "C:\\Users\\Hp\\Desktop\\Music Video\\Sam Tsui Video\\Song\\Sam Tsui - Dont You Worry Child.mp3";
    String song5 = "C:\\Users\\Hp\\Desktop\\Music Video\\Sam Tsui Video\\Song\\Sam Tsui - Fireflies.mp3";
    String songalarm = "C:\\Users\\Hp\\Desktop\\Music Video\\Sam Tsui Video\\Song\\mob.ua-alarm.mp3";

                    
    Calendar cal = new GregorianCalendar();
    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH);
    int date = cal.get(Calendar.DATE);
    int hour = cal.get(Calendar.HOUR);
    int min = cal.get(Calendar.MINUTE);
    int sec = cal.get(Calendar.SECOND);
    int AM_PM = cal.get(Calendar.AM_PM);
    String day_night = "";
    
    int hDisplay = 0;
    int mDisplay = 0;
    
    long diff;
    long diffHours;
    long diffMinutes;
    long diffSeconds;
    String remainder;
            
    int remainingTime = 0; //in seconds
    boolean alarmIsAheadOfCurrent;
    int alarmcount;
    int menualarm =1;
    int stopwatch=0;
    int setTime=0;
            
    String hourDisplay = String.format("%02d", hDisplay);
    String minuteDisplay = String.format("%02d", mDisplay);
    
    int mDisplayStopwatch = 0;
    int sDisplayStopwatch = 0;
    int miliDisplayStopwatch = 0;
    String stopwatchDisplay = String.format("%02d : %02d : %03d", mDisplayStopwatch, sDisplayStopwatch, miliDisplayStopwatch);

    boolean stopwatchIsStopped = true;
    
    Timer timer;
    Timer timer2 = new Timer();
    
    public MainGUI() {
        initComponents();
        
        helpFrame.setVisible(false);
        
        clockTitle.setVisible(true);
        MP3Title.setVisible(true);
        
        clockLabel.setVisible(true);
        stopAlarm.setVisible(false);
        hourInAlarm.setVisible(false);
        colonSymbol.setVisible(false);
        minuteInAlarm.setVisible(false);
        backgroundHourDisplay.setVisible(false);
        backgroundMinuteDisplay.setVisible(false);
        plusHourButton.setVisible(false);
        plusMinuteButton.setVisible(false);
        minusHourButton.setVisible(false);
        minusMinuteButton.setVisible(false);
        timeRemaining.setVisible(false);
        setAlarm.setVisible(false);
        clock_button.setIcon(new ImageIcon(getClass().getResource("clock.png")));
        
        stopwatchLabel.setVisible(false);
        lapStopwatchDisplay.setVisible(false);
        startStopwatch.setVisible(false);
        stopStopwatch.setVisible(false);
        lapStopwatch.setVisible(false);
        resetStopwatch.setVisible(false);
        resetStopwatch.setEnabled(false);
        pause_button.setVisible(false);
        
        hourInAlarm.setText(hourDisplay);
        minuteInAlarm.setText(minuteDisplay);
        
        stopwatchLabel.setText(stopwatchDisplay);
        
        //shortcutMP3.setEnabled(false);
        shortcutJam.setEnabled(true);
        
        new Thread()
        {
            @Override
            public void run()
            {
                while(true)
                {
                    cal = new GregorianCalendar();
                    hour = cal.get(Calendar.HOUR);
                    min = cal.get(Calendar.MINUTE);
                    sec = cal.get(Calendar.SECOND);
                    AM_PM = cal.get(Calendar.AM_PM);
                    
                    if(AM_PM == 1)
                    {
                        hour = hour + 12;
                    }
                    
                    String time = String.format("%02d : %02d : %02d", hour, min, sec);
                    
                    clockLabel.setText(time);
                }
            }
        }.start();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        clockTitle = new javax.swing.JLabel();
        MP3Title = new javax.swing.JLabel();
        helpButton = new javax.swing.JLabel();
        minimize_button = new javax.swing.JLabel();
        close_button = new javax.swing.JLabel();
        custom_frame = new javax.swing.JLabel();
        left_arrow = new javax.swing.JLabel();
        clock_button = new javax.swing.JLabel();
        alarm_button = new javax.swing.JLabel();
        stopwatch_button = new javax.swing.JLabel();
        play_button = new javax.swing.JLabel();
        pause_button = new javax.swing.JLabel();
        rewind_button = new javax.swing.JLabel();
        stop_button = new javax.swing.JLabel();
        forward_button = new javax.swing.JLabel();
        right_arrow = new javax.swing.JLabel();
        clockLabel = new javax.swing.JLabel();
        plusHourButton = new javax.swing.JLabel();
        plusMinuteButton = new javax.swing.JLabel();
        minusHourButton = new javax.swing.JLabel();
        minusMinuteButton = new javax.swing.JLabel();
        hourInAlarm = new javax.swing.JLabel();
        colonSymbol = new javax.swing.JLabel();
        minuteInAlarm = new javax.swing.JLabel();
        backgroundHourDisplay = new javax.swing.JLabel();
        backgroundMinuteDisplay = new javax.swing.JLabel();
        timeRemaining = new javax.swing.JLabel();
        setAlarm = new javax.swing.JButton();
        stopAlarm = new javax.swing.JButton();
        stopwatchLabel = new javax.swing.JLabel();
        startStopwatch = new javax.swing.JButton();
        stopStopwatch = new javax.swing.JButton();
        songTitle = new javax.swing.JTextField();
        songListScrollPane = new javax.swing.JScrollPane();
        songList = new javax.swing.JList();
        lapStopwatch = new javax.swing.JButton();
        resetStopwatch = new javax.swing.JButton();
        select_file = new javax.swing.JLabel();
        lapStopwatchDisplay = new javax.swing.JLabel();
        background1 = new javax.swing.JLabel();
        shortcutJam = new javax.swing.JTextField();
        background2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(420, 210));
        setMinimumSize(new java.awt.Dimension(420, 210));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(420, 210));
        getContentPane().setLayout(null);

        clockTitle.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        clockTitle.setForeground(new java.awt.Color(255, 255, 255));
        clockTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clockTitle.setText("Clock");
        clockTitle.setToolTipText("");
        getContentPane().add(clockTitle);
        clockTitle.setBounds(160, 5, 90, 15);

        MP3Title.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        MP3Title.setForeground(new java.awt.Color(255, 255, 255));
        MP3Title.setText("MP3 Player");
        getContentPane().add(MP3Title);
        MP3Title.setBounds(-230, 5, 63, 15);

        helpButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        helpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/help.png"))); // NOI18N
        helpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        helpButton.setMaximumSize(new java.awt.Dimension(20, 20));
        helpButton.setMinimumSize(new java.awt.Dimension(20, 20));
        helpButton.setName(""); // NOI18N
        helpButton.setPreferredSize(new java.awt.Dimension(20, 20));
        helpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpButtonMouseClicked(evt);
            }
        });
        getContentPane().add(helpButton);
        helpButton.setBounds(354, 2, 20, 20);

        minimize_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/minimize.png"))); // NOI18N
        minimize_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize_button.setMaximumSize(new java.awt.Dimension(20, 20));
        minimize_button.setMinimumSize(new java.awt.Dimension(20, 20));
        minimize_button.setPreferredSize(new java.awt.Dimension(20, 20));
        minimize_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(minimize_button);
        minimize_button.setBounds(376, 2, 20, 20);

        close_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/close.png"))); // NOI18N
        close_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_button.setMaximumSize(new java.awt.Dimension(20, 20));
        close_button.setMinimumSize(new java.awt.Dimension(20, 20));
        close_button.setPreferredSize(new java.awt.Dimension(20, 20));
        close_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(close_button);
        close_button.setBounds(398, 2, 20, 20);

        custom_frame.setBackground(new java.awt.Color(184, 191, 191));
        custom_frame.setForeground(new java.awt.Color(184, 191, 191));
        custom_frame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/frame_abu.png"))); // NOI18N
        custom_frame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                custom_frameMousePressed(evt);
            }
        });
        custom_frame.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                custom_frameMouseDragged(evt);
            }
        });
        getContentPane().add(custom_frame);
        custom_frame.setBounds(0, -5, 420, 30);

        left_arrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/panah kiri.png"))); // NOI18N
        left_arrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        left_arrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                left_arrowMousePressed(evt);
            }
        });
        getContentPane().add(left_arrow);
        left_arrow.setBounds(436, 100, 24, 24);

        clock_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/clock_white.png"))); // NOI18N
        clock_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clock_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clock_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(clock_button);
        clock_button.setBounds(10, 40, 33, 33);

        alarm_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/alarm_white.png"))); // NOI18N
        alarm_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alarm_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alarm_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(alarm_button);
        alarm_button.setBounds(10, 100, 33, 33);

        stopwatch_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stopwatch_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/stopwatch_white.png"))); // NOI18N
        stopwatch_button.setToolTipText("");
        stopwatch_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stopwatch_button.setMaximumSize(new java.awt.Dimension(33, 33));
        stopwatch_button.setMinimumSize(new java.awt.Dimension(33, 33));
        stopwatch_button.setPreferredSize(new java.awt.Dimension(33, 33));
        stopwatch_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopwatch_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(stopwatch_button);
        stopwatch_button.setBounds(10, 160, 33, 33);

        play_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/play1.png"))); // NOI18N
        play_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        play_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                play_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(play_button);
        play_button.setBounds(604, 77, 56, 56);

        pause_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/pause1.png"))); // NOI18N
        pause_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pause_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pause_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(pause_button);
        pause_button.setBounds(605, 77, 56, 56);

        rewind_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/rewind.png"))); // NOI18N
        rewind_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rewind_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rewind_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(rewind_button);
        rewind_button.setBounds(565, 83, 40, 40);

        stop_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/stop.png"))); // NOI18N
        stop_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stop_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stop_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(stop_button);
        stop_button.setBounds(525, 83, 40, 40);

        forward_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/forward.png"))); // NOI18N
        forward_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forward_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forward_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(forward_button);
        forward_button.setBounds(660, 83, 40, 40);

        right_arrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/panah kanan.png"))); // NOI18N
        right_arrow.setText("jLabel3");
        right_arrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        right_arrow.setMaximumSize(new java.awt.Dimension(24, 24));
        right_arrow.setMinimumSize(new java.awt.Dimension(24, 24));
        right_arrow.setPreferredSize(new java.awt.Dimension(24, 24));
        right_arrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                right_arrowMousePressed(evt);
            }
        });
        getContentPane().add(right_arrow);
        right_arrow.setBounds(380, 100, 24, 24);

        clockLabel.setBackground(new java.awt.Color(0, 0, 0));
        clockLabel.setFont(new java.awt.Font("DS-Digital", 1, 48)); // NOI18N
        clockLabel.setForeground(new java.awt.Color(255, 255, 255));
        clockLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clockLabel.setText("CLOCK");
        clockLabel.setMaximumSize(new java.awt.Dimension(290, 60));
        clockLabel.setMinimumSize(new java.awt.Dimension(290, 60));
        clockLabel.setPreferredSize(new java.awt.Dimension(290, 60));
        getContentPane().add(clockLabel);
        clockLabel.setBounds(70, 80, 290, 60);

        plusHourButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/plus.png"))); // NOI18N
        plusHourButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusHourButtonMouseClicked(evt);
            }
        });
        getContentPane().add(plusHourButton);
        plusHourButton.setBounds(120, 90, 50, 20);

        plusMinuteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/plus.png"))); // NOI18N
        plusMinuteButton.setText("jLabel3");
        plusMinuteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusMinuteButtonMouseClicked(evt);
            }
        });
        getContentPane().add(plusMinuteButton);
        plusMinuteButton.setBounds(190, 90, 50, 20);

        minusHourButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/minus.png"))); // NOI18N
        minusHourButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minusHourButtonMouseClicked(evt);
            }
        });
        getContentPane().add(minusHourButton);
        minusHourButton.setBounds(120, 153, 50, 20);

        minusMinuteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/minus.png"))); // NOI18N
        minusMinuteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minusMinuteButtonMouseClicked(evt);
            }
        });
        getContentPane().add(minusMinuteButton);
        minusMinuteButton.setBounds(190, 153, 50, 20);

        hourInAlarm.setFont(new java.awt.Font("DS-Digital", 0, 36)); // NOI18N
        hourInAlarm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hourInAlarm.setText("00");
        getContentPane().add(hourInAlarm);
        hourInAlarm.setBounds(120, 110, 50, 40);

        colonSymbol.setFont(new java.awt.Font("DS-Digital", 0, 36)); // NOI18N
        colonSymbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colonSymbol.setText(":");
        getContentPane().add(colonSymbol);
        colonSymbol.setBounds(170, 110, 20, 40);

        minuteInAlarm.setFont(new java.awt.Font("DS-Digital", 0, 36)); // NOI18N
        minuteInAlarm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minuteInAlarm.setText("00");
        getContentPane().add(minuteInAlarm);
        minuteInAlarm.setBounds(190, 110, 50, 40);

        backgroundHourDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/background_putih 50x40.png"))); // NOI18N
        backgroundHourDisplay.setText("sg");
        getContentPane().add(backgroundHourDisplay);
        backgroundHourDisplay.setBounds(120, 110, 50, 40);

        backgroundMinuteDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/background_putih 50x40.png"))); // NOI18N
        getContentPane().add(backgroundMinuteDisplay);
        backgroundMinuteDisplay.setBounds(190, 110, 50, 40);

        timeRemaining.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 11)); // NOI18N
        timeRemaining.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(timeRemaining);
        timeRemaining.setBounds(100, 30, 230, 60);

        setAlarm.setText("Set");
        setAlarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setAlarmActionPerformed(evt);
            }
        });
        getContentPane().add(setAlarm);
        setAlarm.setBounds(270, 120, 49, 23);

        stopAlarm.setText("Dismiss");
        stopAlarm.setMaximumSize(new java.awt.Dimension(60, 60));
        stopAlarm.setMinimumSize(new java.awt.Dimension(49, 49));
        stopAlarm.setOpaque(false);
        stopAlarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopAlarmActionPerformed(evt);
            }
        });
        getContentPane().add(stopAlarm);
        stopAlarm.setBounds(270, 120, 67, 23);

        stopwatchLabel.setBackground(new java.awt.Color(0, 0, 0));
        stopwatchLabel.setFont(new java.awt.Font("DS-Digital", 1, 48)); // NOI18N
        stopwatchLabel.setForeground(new java.awt.Color(255, 255, 255));
        stopwatchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stopwatchLabel.setText("00 : 00 : 000");
        stopwatchLabel.setMaximumSize(new java.awt.Dimension(290, 60));
        stopwatchLabel.setMinimumSize(new java.awt.Dimension(290, 60));
        stopwatchLabel.setPreferredSize(new java.awt.Dimension(290, 60));
        getContentPane().add(stopwatchLabel);
        stopwatchLabel.setBounds(70, 80, 290, 60);

        startStopwatch.setText("Start");
        startStopwatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startStopwatchActionPerformed(evt);
            }
        });
        getContentPane().add(startStopwatch);
        startStopwatch.setBounds(100, 150, 100, 23);

        stopStopwatch.setText("Stop");
        stopStopwatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopStopwatchActionPerformed(evt);
            }
        });
        getContentPane().add(stopStopwatch);
        stopStopwatch.setBounds(100, 150, 100, 20);

        songTitle.setEditable(false);
        songTitle.setBackground(new java.awt.Color(255, 153, 153));
        songTitle.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        songTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        songTitle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        songTitle.setEnabled(false);
        songTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songTitleActionPerformed(evt);
            }
        });
        getContentPane().add(songTitle);
        songTitle.setBounds(530, 40, 200, 30);

        songListScrollPane.setEnabled(false);

        songList.setBackground(new java.awt.Color(204, 255, 153));
        songList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        songList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Sam Tsui - Born This Way", "Sam Tsui - Bring Me The Night", "Sam Tsui - DJ Got Us Falling In Love", "Sam Tsui - Don't You Worry Child", "Sam Tsui - Fireflies" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        songList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        songList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        songList.setEnabled(false);
        songList.setOpaque(false);
        songList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                songListMouseClicked(evt);
            }
        });
        songList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                songListKeyPressed(evt);
            }
        });
        songListScrollPane.setViewportView(songList);

        getContentPane().add(songListScrollPane);
        songListScrollPane.setBounds(530, 130, 210, 70);

        lapStopwatch.setText("Lap");
        lapStopwatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapStopwatchActionPerformed(evt);
            }
        });
        getContentPane().add(lapStopwatch);
        lapStopwatch.setBounds(220, 150, 110, 23);

        resetStopwatch.setText("Reset");
        resetStopwatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetStopwatchActionPerformed(evt);
            }
        });
        getContentPane().add(resetStopwatch);
        resetStopwatch.setBounds(220, 150, 110, 23);

        select_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/select_file1.png"))); // NOI18N
        select_file.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                select_fileMouseClicked(evt);
            }
        });
        getContentPane().add(select_file);
        select_file.setBounds(700, 83, 40, 40);

        lapStopwatchDisplay.setFont(new java.awt.Font("DS-Digital", 0, 24)); // NOI18N
        lapStopwatchDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lapStopwatchDisplay);
        lapStopwatchDisplay.setBounds(110, 40, 200, 30);

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/background_biru.png"))); // NOI18N
        background1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                background1KeyPressed(evt);
            }
        });
        getContentPane().add(background1);
        background1.setBounds(0, 0, 420, 210);

        shortcutJam.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        shortcutJam.setForeground(new java.awt.Color(255, 255, 255));
        shortcutJam.setToolTipText("");
        shortcutJam.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        shortcutJam.setOpaque(false);
        shortcutJam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                shortcutJamKeyPressed(evt);
            }
        });
        getContentPane().add(shortcutJam);
        shortcutJam.setBounds(0, 0, 420, 210);

        background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/background_pink.png"))); // NOI18N
        background2.setText("jLabel2");
        background2.setMaximumSize(new java.awt.Dimension(420, 210));
        background2.setMinimumSize(new java.awt.Dimension(420, 210));
        background2.setPreferredSize(new java.awt.Dimension(420, 210));
        background2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                background2KeyReleased(evt);
            }
        });
        getContentPane().add(background2);
        background2.setBounds(420, 0, 420, 210);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //UPDATE EVERY TIME YOU ADD A COMPONENT (right & left arrow mouse pressed)
    private void right_arrowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_right_arrowMousePressed
        shortcutJam.setEnabled(true);
        songList.setEnabled(true);
        //shortcutMP3.setEnabled(true);
        AnimationClass AC = new AnimationClass();
        
        AC.jLabelXLeft(clockTitle.getX(), clockTitle.getX()-420, 5, 1, clockTitle);
        AC.jLabelXRight(MP3Title.getX(), MP3Title.getX()+420, 5, 1, MP3Title);
        AC.jLabelXLeft(left_arrow.getX(), left_arrow.getX()-420, 5, 1, left_arrow);
        AC.jLabelXLeft(rewind_button.getX(), rewind_button.getX()-420, 5, 1, rewind_button);
        AC.jLabelXLeft(play_button.getX(), play_button.getX()-420, 5, 1, play_button);
        AC.jLabelXLeft(pause_button.getX(), pause_button.getX()-420, 5, 1, pause_button);
        AC.jLabelXLeft(forward_button.getX(), forward_button.getX()-420, 5, 1, forward_button);
        AC.jLabelXLeft(stop_button.getX(), stop_button.getX()-420, 5, 1, stop_button);
        AC.jLabelXLeft(select_file.getX(), select_file.getX()-420, 5, 1, select_file);
        AC.jTextFieldXLeft(songTitle.getX(), songTitle.getX()-420, 5, 1, songTitle);
        AC.jTextAreaXLeft(songListScrollPane.getX(), songListScrollPane.getX()-420, 5, 1, songListScrollPane);
        AC.jLabelXLeft(background1.getX(), background1.getX()-420, 5, 1, background1);
        AC.jLabelXLeft(clockLabel.getX(), clockLabel.getX()-420, 5, 1, clockLabel);
        AC.jLabelXLeft(stopwatchLabel.getX(), stopwatchLabel.getX()-420, 5, 1, stopwatchLabel);
        AC.jLabelXLeft(right_arrow.getX(), right_arrow.getX()-420, 5, 1, right_arrow);
        AC.jLabelXLeft(alarm_button.getX(), alarm_button.getX()-420, 5, 1, alarm_button);
        
        AC.jLabelXLeft(hourInAlarm.getX(), hourInAlarm.getX()-420, 5, 1, hourInAlarm);
        AC.jLabelXLeft(minuteInAlarm.getX(), minuteInAlarm.getX()-420, 5, 1, minuteInAlarm);
        AC.jLabelXLeft(colonSymbol.getX(), colonSymbol.getX()-420, 5, 1, colonSymbol);
        AC.jLabelXLeft(backgroundHourDisplay.getX(), backgroundHourDisplay.getX()-420, 5, 1, backgroundHourDisplay);
        AC.jLabelXLeft(backgroundMinuteDisplay.getX(), backgroundMinuteDisplay.getX()-420, 5, 1, backgroundMinuteDisplay);
        AC.jLabelXLeft(plusHourButton.getX(), plusHourButton.getX()-420, 5, 1, plusHourButton);
        AC.jLabelXLeft(minusHourButton.getX(), minusHourButton.getX()-420, 5, 1, minusHourButton);
        AC.jLabelXLeft(plusMinuteButton.getX(), plusMinuteButton.getX()-420, 5, 1, plusMinuteButton);
        AC.jLabelXLeft(minusMinuteButton.getX(), minusMinuteButton.getX()-420, 5, 1, minusMinuteButton);
        AC.jLabelXLeft(timeRemaining.getX(), timeRemaining.getX()-420, 5, 1, timeRemaining);
        AC.jButtonXLeft(setAlarm.getX(), setAlarm.getX()-420, 5, 1, setAlarm);
        AC.jButtonXLeft(stopAlarm.getX(), stopAlarm.getX()-420, 5, 1, stopAlarm);
        
        AC.jLabelXLeft(stopwatch_button.getX(), stopwatch_button.getX()-420, 5, 1, stopwatch_button);
        AC.jLabelXLeft(lapStopwatchDisplay.getX(), lapStopwatchDisplay.getX()-420, 5, 1, lapStopwatchDisplay);
        AC.jButtonXLeft(startStopwatch.getX(), startStopwatch.getX()-420, 5, 1, startStopwatch);
        AC.jButtonXLeft(stopStopwatch.getX(), stopStopwatch.getX()-420, 5, 1, stopStopwatch);
        AC.jButtonXLeft(resetStopwatch.getX(), resetStopwatch.getX()-420, 5, 1, resetStopwatch);
        AC.jButtonXLeft(lapStopwatch.getX(), lapStopwatch.getX()-420, 5, 1, lapStopwatch);
        
        AC.jLabelXLeft(clock_button.getX(), clock_button.getX()-420, 5, 1, clock_button);
        AC.jLabelXLeft(background2.getX(), background2.getX()-420, 5, 1, background2);
        
        //AC.jTextFieldXLeft(shortcutJam.getX(), shortcutJam.getX()-420, 5, 1, shortcutJam);
        //AC.jTextFieldXLeft(shortcutMP3.getX(), shortcutMP3.getX()-420, 5, 1, shortcutMP3);
    }//GEN-LAST:event_right_arrowMousePressed

    private void left_arrowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_left_arrowMousePressed
        shortcutJam.setEnabled(true);
        //shortcutMP3.setEnabled(false);
        AnimationClass AC = new AnimationClass();
        
        AC.jLabelXRight(clockTitle.getX(), clockTitle.getX()+420, 5, 1, clockTitle);
        AC.jLabelXLeft(MP3Title.getX(), MP3Title.getX()-420, 5, 1, MP3Title);
        AC.jLabelXRight(left_arrow.getX(), left_arrow.getX()+420, 5, 1, left_arrow);
        AC.jLabelXRight(rewind_button.getX(), rewind_button.getX()+420, 5, 1, rewind_button);
        AC.jLabelXRight(play_button.getX(), play_button.getX()+420, 5, 1, play_button);
        AC.jLabelXRight(pause_button.getX(), pause_button.getX()+420, 5, 1, pause_button);
        AC.jLabelXRight(forward_button.getX(), forward_button.getX()+420, 5, 1, forward_button);
        AC.jLabelXRight(stop_button.getX(), stop_button.getX()+420, 5, 1, stop_button);
        AC.jLabelXRight(select_file.getX(), select_file.getX()+420, 5, 1, select_file);
        AC.jTextFieldXRight(songTitle.getX(), songTitle.getX()+420, 5, 1, songTitle);
        AC.jTextAreaXRight(songListScrollPane.getX(), songListScrollPane.getX()+420, 5, 1, songListScrollPane);
        AC.jLabelXRight(background1.getX(), background1.getX()+420, 5, 1, background1);
        AC.jLabelXRight(clockLabel.getX(), clockLabel.getX()+420, 5, 1, clockLabel);
        AC.jLabelXRight(stopwatchLabel.getX(), stopwatchLabel.getX()+420, 5, 1, stopwatchLabel);
        AC.jLabelXRight(right_arrow.getX(), right_arrow.getX()+420, 5, 1, right_arrow);
        AC.jLabelXRight(alarm_button.getX(), alarm_button.getX()+420, 5, 1, alarm_button);
        
        AC.jLabelXRight(hourInAlarm.getX(), hourInAlarm.getX()+420, 5, 1, hourInAlarm);
        AC.jLabelXRight(minuteInAlarm.getX(), minuteInAlarm.getX()+420, 5, 1, minuteInAlarm);
        AC.jLabelXRight(colonSymbol.getX(), colonSymbol.getX()+420, 5, 1, colonSymbol);
        AC.jLabelXRight(backgroundHourDisplay.getX(), backgroundHourDisplay.getX()+420, 5, 1, backgroundHourDisplay);
        AC.jLabelXRight(backgroundMinuteDisplay.getX(), backgroundMinuteDisplay.getX()+420, 5, 1, backgroundMinuteDisplay);
        AC.jLabelXRight(plusHourButton.getX(), plusHourButton.getX()+420, 5, 1, plusHourButton);
        AC.jLabelXRight(minusHourButton.getX(), minusHourButton.getX()+420, 5, 1, minusHourButton);
        AC.jLabelXRight(plusMinuteButton.getX(), plusMinuteButton.getX()+420, 5, 1, plusMinuteButton);
        AC.jLabelXRight(minusMinuteButton.getX(), minusMinuteButton.getX()+420, 5, 1, minusMinuteButton);
        AC.jLabelXRight(timeRemaining.getX(), timeRemaining.getX()+420, 5, 1, timeRemaining);
        AC.jButtonXRight(setAlarm.getX(), setAlarm.getX()+420, 5, 1, setAlarm);
        AC.jButtonXRight(stopAlarm.getX(), stopAlarm.getX()+420, 5, 1, stopAlarm);
        
        AC.jLabelXRight(stopwatch_button.getX(), stopwatch_button.getX()+420, 5, 1, stopwatch_button);
        AC.jLabelXRight(lapStopwatchDisplay.getX(), lapStopwatchDisplay.getX()+420, 5, 1, lapStopwatchDisplay);
        AC.jButtonXRight(startStopwatch.getX(), startStopwatch.getX()+420, 5, 1, startStopwatch);
        AC.jButtonXRight(stopStopwatch.getX(), stopStopwatch.getX()+420, 5, 1, stopStopwatch);
        AC.jButtonXRight(resetStopwatch.getX(), resetStopwatch.getX()+420, 5, 1, resetStopwatch);
        AC.jButtonXRight(lapStopwatch.getX(), lapStopwatch.getX()+420, 5, 1, lapStopwatch);
        AC.jLabelXRight(clock_button.getX(), clock_button.getX()+420, 5, 1, clock_button);
        AC.jLabelXRight(background2.getX(), background2.getX()+420, 5, 1, background2);
        
        //AC.jTextFieldXRight(shortcutJam.getX(), shortcutJam.getX()+420, 5, 1, shortcutJam);
        //AC.jTextFieldXRight(shortcutMP3.getX(), shortcutMP3.getX()+420, 5, 1, shortcutMP3);
    }//GEN-LAST:event_left_arrowMousePressed

    private void custom_frameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custom_frameMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_custom_frameMouseDragged

    private void minimize_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_buttonMouseClicked
        this.setState(MainGUI.ICONIFIED);
    }//GEN-LAST:event_minimize_buttonMouseClicked

    private void close_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_buttonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_close_buttonMouseClicked

    private void custom_frameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custom_frameMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_custom_frameMousePressed

    private void play_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play_buttonMouseClicked
        if(errorHandling>0)
        {
                if(songList.getSelectedValue()!=null){
                play_button.setVisible(false);
                pause_button.setVisible(true);
                String songChoose = String.valueOf(songList.getSelectedValue());
                if(songChoose.equals("Sam Tsui - Born This Way"))
                {
                    recentSong = 1;
                    songList.clearSelection();
                    MC.Stop();
                    MC.Play(song1);
                }
                else if(songChoose.equals("Sam Tsui - Bring Me The Night"))
                {
                    recentSong = 2;
                    songList.clearSelection();
                    MC.Stop();
                    MC.Play(song2);
                }
                else if(songChoose.equals("Sam Tsui - DJ Got Us Falling In Love"))
                {
                    recentSong = 3;
                    songList.clearSelection();
                    MC.Stop();
                    MC.Play(song3);
                }
                else if(songChoose.equals("Sam Tsui - Don't You Worry Child"))
                {
                    recentSong = 4;
                    songList.clearSelection();
                    MC.Stop();
                    MC.Play(song4);
                }
                else if(songChoose.equals("Sam Tsui - Fireflies"))
                {
                    recentSong = 5;
                    songList.clearSelection();
                    MC.Stop();
                    MC.Play(song5);
                }
                songTitle.setText(songChoose);
                }
                else
                {
                    MC.Resume();
                    play_button.setVisible(false);
                    pause_button.setVisible(true);
                }
            }
            
    }//GEN-LAST:event_play_buttonMouseClicked

    private void pause_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pause_buttonMouseClicked
        play_button.setVisible(true);
        pause_button.setVisible(false);
        MC.Pause();
    }//GEN-LAST:event_pause_buttonMouseClicked

    private void clock_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clock_buttonMouseClicked
        clockTitle.setText("Clock");
        clockLabel.setVisible(true);
        clock_button.setIcon(new ImageIcon(getClass().getResource("clock.png")));
        
        hourInAlarm.setVisible(false);
        colonSymbol.setVisible(false);
        minuteInAlarm.setVisible(false);
        backgroundHourDisplay.setVisible(false);
        backgroundMinuteDisplay.setVisible(false);
        plusHourButton.setVisible(false);
        plusMinuteButton.setVisible(false);
        minusHourButton.setVisible(false);
        minusMinuteButton.setVisible(false);
        timeRemaining.setVisible(false);
        setAlarm.setVisible(false);
        stopAlarm.setVisible(false);
        alarm_button.setIcon(new ImageIcon(getClass().getResource("alarm_white.png")));
        
        stopwatchLabel.setVisible(false);
        lapStopwatchDisplay.setVisible(false);
        startStopwatch.setVisible(false);
        stopStopwatch.setVisible(false);
        lapStopwatch.setVisible(false);
        resetStopwatch.setVisible(false);
        resetStopwatch.setEnabled(false);
        stopwatch_button.setIcon(new ImageIcon(getClass().getResource("stopwatch_white.png")));
    }//GEN-LAST:event_clock_buttonMouseClicked

    private void alarm_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alarm_buttonMouseClicked
        clockTitle.setText("Alarm");
        clockLabel.setVisible(false);
        clock_button.setIcon(new ImageIcon(getClass().getResource("clock_white.png")));
        
        hourInAlarm.setVisible(true);
        colonSymbol.setVisible(true);
        minuteInAlarm.setVisible(true);
        backgroundHourDisplay.setVisible(true);
        backgroundMinuteDisplay.setVisible(true);
        plusHourButton.setVisible(true);
        plusMinuteButton.setVisible(true);
        minusHourButton.setVisible(true);
        minusMinuteButton.setVisible(true);
        timeRemaining.setVisible(true);
        setAlarm.setVisible(true);
        if(timeRemaining.getText().equals("RINGG!!"))
        {
            setAlarm.setVisible(false);
            stopAlarm.setVisible(true);
        }
        alarm_button.setIcon(new ImageIcon(getClass().getResource("alarm.png")));
        
        stopwatchLabel.setVisible(false);
        lapStopwatchDisplay.setVisible(false);
        startStopwatch.setVisible(false);
        stopStopwatch.setVisible(false);
        lapStopwatch.setVisible(false);
        resetStopwatch.setVisible(false);
        resetStopwatch.setEnabled(false);
        stopwatch_button.setIcon(new ImageIcon(getClass().getResource("stopwatch_white.png")));
    }//GEN-LAST:event_alarm_buttonMouseClicked

    private void stopwatch_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopwatch_buttonMouseClicked
        clockTitle.setText("Stopwatch");
        clockLabel.setVisible(false);
        clock_button.setIcon(new ImageIcon(getClass().getResource("clock_white.png")));
        
        hourInAlarm.setVisible(false);
        colonSymbol.setVisible(false);
        minuteInAlarm.setVisible(false);
        backgroundHourDisplay.setVisible(false);
        backgroundMinuteDisplay.setVisible(false);
        plusHourButton.setVisible(false);
        plusMinuteButton.setVisible(false);
        minusHourButton.setVisible(false);
        minusMinuteButton.setVisible(false);
        timeRemaining.setVisible(false);
        setAlarm.setVisible(false);
        stopAlarm.setVisible(false);
        alarm_button.setIcon(new ImageIcon(getClass().getResource("alarm_white.png")));
        
        stopwatchLabel.setVisible(true);
        lapStopwatchDisplay.setVisible(true);
        if(stopwatchIsStopped == true)
        {
            if(mDisplayStopwatch == 0 && sDisplayStopwatch == 0 && miliDisplayStopwatch == 0)
            {
                startStopwatch.setVisible(true);
                stopStopwatch.setVisible(false);
                lapStopwatch.setVisible(false);
                resetStopwatch.setVisible(true);
                resetStopwatch.setEnabled(false);
            }
            else
            {
                startStopwatch.setVisible(true);
                stopStopwatch.setVisible(false);
                lapStopwatch.setVisible(false);
                resetStopwatch.setVisible(true);
                resetStopwatch.setEnabled(true);
            }
        }
        else //stopwatchIsStopped == false
        {
            startStopwatch.setVisible(false);
            stopStopwatch.setVisible(true);
            lapStopwatch.setVisible(true);
            resetStopwatch.setVisible(false);
            resetStopwatch.setEnabled(false);
        }
        stopwatch_button.setIcon(new ImageIcon(getClass().getResource("stopwatch.png")));
    }//GEN-LAST:event_stopwatch_buttonMouseClicked

    private void startStopwatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startStopwatchActionPerformed
        resetStopwatch.setVisible(false);
        lapStopwatch.setVisible(true);
        timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                miliDisplayStopwatch++;
                if(miliDisplayStopwatch == 1000)
                {
                    miliDisplayStopwatch = 0;
                    sDisplayStopwatch++;
                }
                if(sDisplayStopwatch == 60)
                {
                    sDisplayStopwatch = 0;
                    mDisplayStopwatch++;
                }
                String stopwatchDisplay = String.format("%02d : %02d : %03d", mDisplayStopwatch, sDisplayStopwatch, miliDisplayStopwatch);
                stopwatchLabel.setText(stopwatchDisplay);
            }
        };
        timer.scheduleAtFixedRate(timerTask, 0, 1);
        
        stopwatchIsStopped = false;
        
        startStopwatch.setVisible(false);
        stopStopwatch.setVisible(true);
    }//GEN-LAST:event_startStopwatchActionPerformed

    private void stopStopwatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopStopwatchActionPerformed
        resetStopwatch.setVisible(true);
        resetStopwatch.setEnabled(true);
        lapStopwatch.setVisible(false);
        timer.cancel();
        
        stopwatchIsStopped = true;
        
        startStopwatch.setVisible(true);
        stopStopwatch.setVisible(false);
    }//GEN-LAST:event_stopStopwatchActionPerformed

    private void resetStopwatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetStopwatchActionPerformed
        mDisplayStopwatch = 0;
        sDisplayStopwatch = 0;
        miliDisplayStopwatch = 0;
        stopwatchDisplay = String.format("%02d : %02d : %03d", mDisplayStopwatch, sDisplayStopwatch, miliDisplayStopwatch);
        stopwatchLabel.setText(stopwatchDisplay);
        
        lapStopwatchDisplay.setText("");
        startStopwatch.setVisible(true);
        stopStopwatch.setVisible(false);
        lapStopwatch.setVisible(false);
        resetStopwatch.setVisible(true);
        resetStopwatch.setEnabled(false);
    }//GEN-LAST:event_resetStopwatchActionPerformed

    private void lapStopwatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapStopwatchActionPerformed
        stopwatchDisplay = String.format("%02d : %02d : %03d", mDisplayStopwatch, sDisplayStopwatch, miliDisplayStopwatch);
        lapStopwatchDisplay.setText(stopwatchDisplay);
    }//GEN-LAST:event_lapStopwatchActionPerformed

    private void setAlarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setAlarmActionPerformed
        timer2.cancel();
        
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dateStart = String.format("%02d/%02d/%d %02d:%02d:%02d", date, month, year, hour, min, sec);
        String dateStop = String.format("%02d/%02d/%d %02d:%02d:00", date, month, year, hDisplay, mDisplay);

        Date d1 = null;
        Date d2 = null;

        try {
            d1 = format.parse(dateStart);
            d2 = format.parse(dateStop);

            diff = d2.getTime() - d1.getTime();

            diffSeconds = diff/1000;

            if(diffSeconds < 0)
            {
                dateStop = String.format("%02d/%02d/%d %02d:%02d:00", date+1, month, year, hDisplay, mDisplay);
                d2 = format.parse(dateStop);
                diff = d2.getTime() - d1.getTime();
                diffSeconds = diff/1000;
            }

            diffSeconds = diff / 1000 % 60;
            diffMinutes = diff / (60 * 1000) % 60;
            diffHours = diff / (60 * 60 * 1000) % 24;

            remainder = String.format("<html>Time remaining:<br>%d hours, %d minutes, and %d seconds</html>", diffHours, diffMinutes, diffSeconds);
            timeRemaining.setText(remainder);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        timer2 = new Timer();
        TimerTask timerTask2 = new TimerTask() {
            @Override
            public void run() {
                diff--;
                diffSeconds = diff / 1000 % 60;
                diffMinutes = diff / (60 * 1000) % 60;
                diffHours = diff / (60 * 60 * 1000) % 24; 
                remainder = String.format("<html>Time remaining:<br>%d hours, %d minutes, and %d seconds</html>", diffHours, diffMinutes, diffSeconds);
                timeRemaining.setText(remainder);
            }
        };
        timer2.scheduleAtFixedRate(timerTask2, 0, 1);
        
        Timer timer3 = new Timer();
        TimerTask timerTask3 = new TimerTask() {
            @Override
            public void run() {
                //THIS IS WHAT THE ALARM DOES!!
                timer2.cancel();
                if(alarmcount==0)
                {
                    setAlarm.setVisible(false);
                    stopAlarm.setVisible(true);
                    
                    MC.Stop();
                    MC.Play(songalarm);
                    play_button.setVisible(true);
                    pause_button.setVisible(false);
                }
                timeRemaining.setText("RINGG!!");
                //stopAlarm.setVisible(true);
            }
        };   
        timer3.schedule(timerTask3, diff);
    }//GEN-LAST:event_setAlarmActionPerformed

    private void plusHourButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusHourButtonMouseClicked
        if(hDisplay == 23)
        {
            hDisplay = 0;
        }
        else
        {
            hDisplay++;
        }
        hourInAlarm.setText(String.format("%02d", hDisplay));
    }//GEN-LAST:event_plusHourButtonMouseClicked

    private void plusMinuteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusMinuteButtonMouseClicked
        if(mDisplay == 59)
        {
            mDisplay = 0;
            if(hDisplay == 23)
            {
                hDisplay = 0;
            }
            else
            {
                hDisplay++;
            } 
        }
        else
        {
            mDisplay++;
        }
        hourInAlarm.setText(String.format("%02d", hDisplay));
        minuteInAlarm.setText(String.format("%02d", mDisplay));
    }//GEN-LAST:event_plusMinuteButtonMouseClicked

    private void minusHourButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusHourButtonMouseClicked
        if(hDisplay == 0)
        {
            hDisplay = 23;
        }
        else
        {
            hDisplay--;
        }
        hourInAlarm.setText(String.format("%02d", hDisplay));
    }//GEN-LAST:event_minusHourButtonMouseClicked

    private void minusMinuteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMinuteButtonMouseClicked
        if(mDisplay == 0)
        {
            mDisplay = 59;
            if(hDisplay == 0)
            {
                hDisplay = 23;
            }
            else
            {
                hDisplay--;
            }
        }
        else
        {
            mDisplay--;
        }
        hourInAlarm.setText(String.format("%02d", hDisplay));
        minuteInAlarm.setText(String.format("%02d", mDisplay));
    }//GEN-LAST:event_minusMinuteButtonMouseClicked

    private void select_fileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_select_fileMouseClicked
        errorHandling++;
        MC.Stop();
        FileFilter filter = new FileNameExtensionFilter("MP3 Files","mp3","mpeg3");
        
        JFileChooser chooser = new JFileChooser("C:\\Users\\Hp\\Desktop\\Music Video\\Sam Tsui Video\\Song");

        chooser.addChoosableFileFilter(filter);
        
        int returnVal = chooser.showOpenDialog(null);
        
        if(returnVal == JFileChooser.APPROVE_OPTION)
        {
            File myFile = chooser.getSelectedFile();
            String song = myFile + "";
               
            String name = chooser.getSelectedFile().getName();
            
            play_button.setVisible(false);
            pause_button.setVisible(true);
            
            MC.Play(song);
            songTitle.setText(name);
        }// TODO add your handling code here:
    }//GEN-LAST:event_select_fileMouseClicked

    private void stop_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stop_buttonMouseClicked
        MC.Stop();
        play_button.setVisible(true);
        pause_button.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_stop_buttonMouseClicked

    private void songTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songTitleActionPerformed

    private void songListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_songListMouseClicked
        errorHandling++;
        String songChoose = String.valueOf(songList.getSelectedValue());
        if(songChoose.equals("Sam Tsui - Born This Way"))
        {
            if(evt.getClickCount()==2)
            {
                    recentSong = 1;
                    MC.Stop();
                    
                    play_button.setVisible(false);
                    pause_button.setVisible(true);

                    MC.Play(song1);
                    songTitle.setText("Sam Tsui - Born This Way.mp3");
            }
        }
        else if(songChoose.equals("Sam Tsui - Bring Me The Night"))
        {
            if(evt.getClickCount()==2)
            {
                    recentSong = 2;    
                    MC.Stop();
                    
                    play_button.setVisible(false);
                    pause_button.setVisible(true);
                    
                    MC.Play(song2);
                    songTitle.setText("Sam Tsui - Bring Me The Night.mp3");
            }
        }
        else if(songChoose.equals("Sam Tsui - DJ Got Us Falling In Love"))
        {
            if(evt.getClickCount()==2)
            {
                    recentSong = 3;
                    MC.Stop();
                   
                    play_button.setVisible(false);
                    pause_button.setVisible(true);

                    MC.Play(song3);
                    songTitle.setText("Sam Tsui - DJ Got Us Falling In Love.mp3");
            }
        }
        else if(songChoose.equals("Sam Tsui - Don't You Worry Child"))
        {
            if(evt.getClickCount()==2)
            {
                    recentSong = 4;
                    MC.Stop();
                    
                    play_button.setVisible(false);
                    pause_button.setVisible(true);

                    MC.Play(song4);
                    songTitle.setText("Sam Tsui - Don't You Worry Child.mp3");
            }
        }
        else if(songChoose.equals("Sam Tsui - Fireflies"))
        {
            if(evt.getClickCount()==2)
            {
                    recentSong = 5;
                    MC.Stop();
                    
                    play_button.setVisible(false);
                    pause_button.setVisible(true);

                    MC.Play(song5);
                    songTitle.setText("Sam Tsui - Fireflies.mp3");
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_songListMouseClicked

    private void forward_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forward_buttonMouseClicked
        if(recentSong+1<6)
        {
            recentSong = recentSong+1;
            
            if(recentSong==2)
            {
                    MC.Stop();
                    
                    play_button.setVisible(false);
                    pause_button.setVisible(true);

                    MC.Play(song2);
                    songTitle.setText("Sam Tsui - Bring Me The Night.mp3");
            }
            if(recentSong==3)
            {
                    MC.Stop();
                    
                    play_button.setVisible(false);
                    pause_button.setVisible(true);

                    MC.Play(song3);
                    songTitle.setText("Sam Tsui - DJ Got Us Falling In Love.mp3");
            }
            if(recentSong==4)
            {
                    MC.Stop();
                    
                    play_button.setVisible(false);
                    pause_button.setVisible(true);

                    MC.Play(song4);
                    songTitle.setText("Sam Tsui - Don't You Worry Child.mp3");
            }
            if(recentSong==5)
            {
                    MC.Stop();
                    
                    play_button.setVisible(false);
                    pause_button.setVisible(true);

                    MC.Play(song5);
                    songTitle.setText("Sam Tsui - Fireflies.mp3");
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_forward_buttonMouseClicked

    private void rewind_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rewind_buttonMouseClicked
        if(recentSong-1>0)
        {
            recentSong = recentSong-1;
            if(recentSong==2)
            {
                    MC.Stop();
                    
                    play_button.setVisible(false);
                    pause_button.setVisible(true);

                    MC.Play(song2);
                    songTitle.setText("Sam Tsui - Bring Me The Night.mp3");
            }
            if(recentSong==3)
            {
                    MC.Stop();
                    
                    play_button.setVisible(false);
                    pause_button.setVisible(true);

                    MC.Play(song3);
                    songTitle.setText("Sam Tsui - DJ Got Us Falling In Love.mp3");
            }
            if(recentSong==4)
            {
                    MC.Stop();
                    
                    play_button.setVisible(false);
                    pause_button.setVisible(true);

                    MC.Play(song4);
                    songTitle.setText("Sam Tsui - Don't You Worry Child.mp3");
            }
            if(recentSong==1)
            {
                    MC.Stop();
                    
                    play_button.setVisible(false);
                    pause_button.setVisible(true);

                    MC.Play(song1);
                    songTitle.setText("Sam Tsui - Born This Way.mp3");
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_rewind_buttonMouseClicked

    private void stopAlarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopAlarmActionPerformed
        MC.Stop();
        setAlarm.setVisible(true);
        stopAlarm.setVisible(false);
        timeRemaining.setText("");
    }//GEN-LAST:event_stopAlarmActionPerformed

    private void background1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_background1KeyPressed
        
    }//GEN-LAST:event_background1KeyPressed

    private void background2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_background2KeyReleased
        
    }//GEN-LAST:event_background2KeyReleased

    private void shortcutJamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_shortcutJamKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_RIGHT&& background2.getX()==420)
        {
            songList.setEnabled(true);
            //shortcutMP3.setEnabled(true);
            AnimationClass AC = new AnimationClass();
        
            AC.jLabelXLeft(clockTitle.getX(), clockTitle.getX()-420, 5, 1, clockTitle);
            AC.jLabelXRight(MP3Title.getX(), MP3Title.getX()+420, 5, 1, MP3Title);
            AC.jLabelXLeft(left_arrow.getX(), left_arrow.getX()-420, 5, 1, left_arrow);
            AC.jLabelXLeft(rewind_button.getX(), rewind_button.getX()-420, 5, 1, rewind_button);
            AC.jLabelXLeft(play_button.getX(), play_button.getX()-420, 5, 1, play_button);
            AC.jLabelXLeft(pause_button.getX(), pause_button.getX()-420, 5, 1, pause_button);
            AC.jLabelXLeft(forward_button.getX(), forward_button.getX()-420, 5, 1, forward_button);
            AC.jLabelXLeft(stop_button.getX(), stop_button.getX()-420, 5, 1, stop_button);
            AC.jLabelXLeft(select_file.getX(), select_file.getX()-420, 5, 1, select_file);
            AC.jTextFieldXLeft(songTitle.getX(), songTitle.getX()-420, 5, 1, songTitle);
            AC.jTextAreaXLeft(songListScrollPane.getX(), songListScrollPane.getX()-420, 5, 1, songListScrollPane);
            AC.jLabelXLeft(background1.getX(), background1.getX()-420, 5, 1, background1);
            AC.jLabelXLeft(clockLabel.getX(), clockLabel.getX()-420, 5, 1, clockLabel);
            AC.jLabelXLeft(stopwatchLabel.getX(), stopwatchLabel.getX()-420, 5, 1, stopwatchLabel);
            AC.jLabelXLeft(right_arrow.getX(), right_arrow.getX()-420, 5, 1, right_arrow);
            AC.jLabelXLeft(alarm_button.getX(), alarm_button.getX()-420, 5, 1, alarm_button);

            AC.jLabelXLeft(hourInAlarm.getX(), hourInAlarm.getX()-420, 5, 1, hourInAlarm);
            AC.jLabelXLeft(minuteInAlarm.getX(), minuteInAlarm.getX()-420, 5, 1, minuteInAlarm);
            AC.jLabelXLeft(colonSymbol.getX(), colonSymbol.getX()-420, 5, 1, colonSymbol);
            AC.jLabelXLeft(backgroundHourDisplay.getX(), backgroundHourDisplay.getX()-420, 5, 1, backgroundHourDisplay);
            AC.jLabelXLeft(backgroundMinuteDisplay.getX(), backgroundMinuteDisplay.getX()-420, 5, 1, backgroundMinuteDisplay);
            AC.jLabelXLeft(plusHourButton.getX(), plusHourButton.getX()-420, 5, 1, plusHourButton);
            AC.jLabelXLeft(minusHourButton.getX(), minusHourButton.getX()-420, 5, 1, minusHourButton);
            AC.jLabelXLeft(plusMinuteButton.getX(), plusMinuteButton.getX()-420, 5, 1, plusMinuteButton);
            AC.jLabelXLeft(minusMinuteButton.getX(), minusMinuteButton.getX()-420, 5, 1, minusMinuteButton);
            AC.jLabelXLeft(timeRemaining.getX(), timeRemaining.getX()-420, 5, 1, timeRemaining);
            AC.jButtonXLeft(setAlarm.getX(), setAlarm.getX()-420, 5, 1, setAlarm);
            AC.jButtonXLeft(stopAlarm.getX(), stopAlarm.getX()-420, 5, 1, stopAlarm);

            AC.jLabelXLeft(stopwatch_button.getX(), stopwatch_button.getX()-420, 5, 1, stopwatch_button);
            AC.jLabelXLeft(lapStopwatchDisplay.getX(), lapStopwatchDisplay.getX()-420, 5, 1, lapStopwatchDisplay);
            AC.jButtonXLeft(startStopwatch.getX(), startStopwatch.getX()-420, 5, 1, startStopwatch);
            AC.jButtonXLeft(stopStopwatch.getX(), stopStopwatch.getX()-420, 5, 1, stopStopwatch);
            AC.jButtonXLeft(resetStopwatch.getX(), resetStopwatch.getX()-420, 5, 1, resetStopwatch);
            AC.jButtonXLeft(lapStopwatch.getX(), lapStopwatch.getX()-420, 5, 1, lapStopwatch);

            AC.jLabelXLeft(clock_button.getX(), clock_button.getX()-420, 5, 1, clock_button);
            AC.jLabelXLeft(background2.getX(), background2.getX()-420, 5, 1, background2);
            
            //AC.jTextFieldXLeft(shortcutJam.getX(), shortcutJam.getX()-420, 5, 1, shortcutJam);
            //AC.jTextFieldXLeft(shortcutMP3.getX(), shortcutMP3.getX()-420, 5, 1, shortcutMP3);
            }
            if(evt.getKeyCode()== KeyEvent.VK_LEFT && background1.getX()==-420)
            {
                shortcutJam.setEnabled(true);
                songList.setEnabled(false);
                AnimationClass AC = new AnimationClass();

                AC.jLabelXRight(clockTitle.getX(), clockTitle.getX()+420, 5, 1, clockTitle);
                AC.jLabelXLeft(MP3Title.getX(), MP3Title.getX()-420, 5, 1, MP3Title);
                AC.jLabelXRight(left_arrow.getX(), left_arrow.getX()+420, 5, 1, left_arrow);
                AC.jLabelXRight(rewind_button.getX(), rewind_button.getX()+420, 5, 1, rewind_button);
                AC.jLabelXRight(play_button.getX(), play_button.getX()+420, 5, 1, play_button);
                AC.jLabelXRight(pause_button.getX(), pause_button.getX()+420, 5, 1, pause_button);
                AC.jLabelXRight(forward_button.getX(), forward_button.getX()+420, 5, 1, forward_button);
                AC.jLabelXRight(stop_button.getX(), stop_button.getX()+420, 5, 1, stop_button);
                AC.jLabelXRight(select_file.getX(), select_file.getX()+420, 5, 1, select_file);
                AC.jTextFieldXRight(songTitle.getX(), songTitle.getX()+420, 5, 1, songTitle);
                AC.jTextAreaXRight(songListScrollPane.getX(), songListScrollPane.getX()+420, 5, 1, songListScrollPane);
                AC.jLabelXRight(background1.getX(), background1.getX()+420, 5, 1, background1);
                AC.jLabelXRight(clockLabel.getX(), clockLabel.getX()+420, 5, 1, clockLabel);
                AC.jLabelXRight(stopwatchLabel.getX(), stopwatchLabel.getX()+420, 5, 1, stopwatchLabel);
                AC.jLabelXRight(right_arrow.getX(), right_arrow.getX()+420, 5, 1, right_arrow);
                AC.jLabelXRight(alarm_button.getX(), alarm_button.getX()+420, 5, 1, alarm_button);

                AC.jLabelXRight(hourInAlarm.getX(), hourInAlarm.getX()+420, 5, 1, hourInAlarm);
                AC.jLabelXRight(minuteInAlarm.getX(), minuteInAlarm.getX()+420, 5, 1, minuteInAlarm);
                AC.jLabelXRight(colonSymbol.getX(), colonSymbol.getX()+420, 5, 1, colonSymbol);
                AC.jLabelXRight(backgroundHourDisplay.getX(), backgroundHourDisplay.getX()+420, 5, 1, backgroundHourDisplay);
                AC.jLabelXRight(backgroundMinuteDisplay.getX(), backgroundMinuteDisplay.getX()+420, 5, 1, backgroundMinuteDisplay);
                AC.jLabelXRight(plusHourButton.getX(), plusHourButton.getX()+420, 5, 1, plusHourButton);
                AC.jLabelXRight(minusHourButton.getX(), minusHourButton.getX()+420, 5, 1, minusHourButton);
                AC.jLabelXRight(plusMinuteButton.getX(), plusMinuteButton.getX()+420, 5, 1, plusMinuteButton);
                AC.jLabelXRight(minusMinuteButton.getX(), minusMinuteButton.getX()+420, 5, 1, minusMinuteButton);
                AC.jLabelXRight(timeRemaining.getX(), timeRemaining.getX()+420, 5, 1, timeRemaining);
                AC.jButtonXRight(setAlarm.getX(), setAlarm.getX()+420, 5, 1, setAlarm);
                AC.jButtonXRight(stopAlarm.getX(), stopAlarm.getX()+420, 5, 1, stopAlarm);

                AC.jLabelXRight(stopwatch_button.getX(), stopwatch_button.getX()+420, 5, 1, stopwatch_button);
                AC.jLabelXRight(lapStopwatchDisplay.getX(), lapStopwatchDisplay.getX()+420, 5, 1, lapStopwatchDisplay);
                AC.jButtonXRight(startStopwatch.getX(), startStopwatch.getX()+420, 5, 1, startStopwatch);
                AC.jButtonXRight(stopStopwatch.getX(), stopStopwatch.getX()+420, 5, 1, stopStopwatch);
                AC.jButtonXRight(resetStopwatch.getX(), resetStopwatch.getX()+420, 5, 1, resetStopwatch);
                AC.jButtonXRight(lapStopwatch.getX(), lapStopwatch.getX()+420, 5, 1, lapStopwatch);
                AC.jLabelXRight(clock_button.getX(), clock_button.getX()+420, 5, 1, clock_button);
                AC.jLabelXRight(background2.getX(), background2.getX()+420, 5, 1, background2);

                //AC.jTextFieldXRight(shortcutJam.getX(), shortcutJam.getX()+420, 5, 1, shortcutJam);
                //AC.jTextFieldXRight(shortcutMP3.getX(), shortcutMP3.getX()+420, 5, 1, shortcutMP3); 
            }// TODO add your handling code here:
            if(evt.getKeyCode()== KeyEvent.VK_SPACE&&background1.getX()<0)
            {
                if(play_button.isVisible()==true)
                {
                    MC.Resume();
                    play_button.setVisible(false);
                    pause_button.setVisible(true);
                }
                else if(pause_button.isVisible()==true)
                {
                    MC.Pause();
                    play_button.setVisible(true);
                    pause_button.setVisible(false);
                }
            }
            if(evt.getKeyCode()== KeyEvent.VK_S&&background1.getX()<0)
            {
                System.out.println("Here");
                MC.Stop();
                play_button.setVisible(true);
                pause_button.setVisible(false);
            }
            if((evt.getKeyCode()== KeyEvent.VK_UP||evt.getKeyCode()== KeyEvent.VK_DOWN)&&background1.getX()<0)
            {
                shortcutJam.setEnabled(false);
                songList.setEnabled(true);
                //songList.setSelectedIndex(0);
            }
            if((evt.getKeyCode()== KeyEvent.VK_UP||evt.getKeyCode()== KeyEvent.VK_DOWN)&&background2.getX()>400)
            {
                if(evt.getKeyCode()== KeyEvent.VK_UP)
                {
                    if((menualarm-1)>0)
                    {
                        menualarm--;
                    }
                }
                else
                {
                    if((menualarm+1)<4)
                    {
                        menualarm++;
                    }
                }
                if(menualarm==1)
                {
                    clockTitle.setText("Clock");
                    clockLabel.setVisible(true);
                    clock_button.setIcon(new ImageIcon(getClass().getResource("clock.png")));

                    hourInAlarm.setVisible(false);
                    colonSymbol.setVisible(false);
                    minuteInAlarm.setVisible(false);
                    backgroundHourDisplay.setVisible(false);
                    backgroundMinuteDisplay.setVisible(false);
                    plusHourButton.setVisible(false);
                    plusMinuteButton.setVisible(false);
                    minusHourButton.setVisible(false);
                    minusMinuteButton.setVisible(false);
                    timeRemaining.setVisible(false);
                    setAlarm.setVisible(false);
                    stopAlarm.setVisible(false);
                    alarm_button.setIcon(new ImageIcon(getClass().getResource("alarm_white.png")));

                    stopwatchLabel.setVisible(false);
                    lapStopwatchDisplay.setVisible(false);
                    startStopwatch.setVisible(false);
                    stopStopwatch.setVisible(false);
                    lapStopwatch.setVisible(false);
                    resetStopwatch.setVisible(false);
                    resetStopwatch.setEnabled(false);
                    stopwatch_button.setIcon(new ImageIcon(getClass().getResource("stopwatch_white.png")));
                }
                else if(menualarm==2)
                {
                    clockTitle.setText("Alarm");
                    clockLabel.setVisible(false);
                    clock_button.setIcon(new ImageIcon(getClass().getResource("clock_white.png")));

                    hourInAlarm.setVisible(true);
                    colonSymbol.setVisible(true);
                    minuteInAlarm.setVisible(true);
                    backgroundHourDisplay.setVisible(true);
                    backgroundMinuteDisplay.setVisible(true);
                    plusHourButton.setVisible(true);
                    plusMinuteButton.setVisible(true);
                    minusHourButton.setVisible(true);
                    minusMinuteButton.setVisible(true);
                    timeRemaining.setVisible(true);
                    setAlarm.setVisible(true);
                    if(timeRemaining.getText().equals("RINGG!!"))
                    {
                        setAlarm.setVisible(false);
                        stopAlarm.setVisible(true);
                    }
                    alarm_button.setIcon(new ImageIcon(getClass().getResource("alarm.png")));

                    stopwatchLabel.setVisible(false);
                    lapStopwatchDisplay.setVisible(false);
                    startStopwatch.setVisible(false);
                    stopStopwatch.setVisible(false);
                    lapStopwatch.setVisible(false);
                    resetStopwatch.setVisible(false);
                    resetStopwatch.setEnabled(false);
                    stopwatch_button.setIcon(new ImageIcon(getClass().getResource("stopwatch_white.png")));
                }
                else
                {
                    clockTitle.setText("Stopwatch");
                    clockLabel.setVisible(false);
                    clock_button.setIcon(new ImageIcon(getClass().getResource("clock_white.png")));

                    hourInAlarm.setVisible(false);
                    colonSymbol.setVisible(false);
                    minuteInAlarm.setVisible(false);
                    backgroundHourDisplay.setVisible(false);
                    backgroundMinuteDisplay.setVisible(false);
                    plusHourButton.setVisible(false);
                    plusMinuteButton.setVisible(false);
                    minusHourButton.setVisible(false);
                    minusMinuteButton.setVisible(false);
                    timeRemaining.setVisible(false);
                    setAlarm.setVisible(false);
                    stopAlarm.setVisible(false);
                    alarm_button.setIcon(new ImageIcon(getClass().getResource("alarm_white.png")));

                    stopwatchLabel.setVisible(true);
                    lapStopwatchDisplay.setVisible(true);
                    if(stopwatchIsStopped == true)
                    {
                        if(mDisplayStopwatch == 0 && sDisplayStopwatch == 0 && miliDisplayStopwatch == 0)
                        {
                            startStopwatch.setVisible(true);
                            stopStopwatch.setVisible(false);
                            lapStopwatch.setVisible(false);
                            resetStopwatch.setVisible(true);
                            resetStopwatch.setEnabled(false);
                        }
                        else
                        {
                            startStopwatch.setVisible(true);
                            stopStopwatch.setVisible(false);
                            lapStopwatch.setVisible(false);
                            resetStopwatch.setVisible(true);
                            resetStopwatch.setEnabled(true);
                        }
                    }
                    else //stopwatchIsStopped == false
                    {
                        startStopwatch.setVisible(false);
                        stopStopwatch.setVisible(true);
                        lapStopwatch.setVisible(true);
                        resetStopwatch.setVisible(false);
                        resetStopwatch.setEnabled(false);
                    }
                    stopwatch_button.setIcon(new ImageIcon(getClass().getResource("stopwatch.png")));
                }
            }
            if(evt.getKeyCode()== KeyEvent.VK_S&&background2.getX()>400)
            {
                System.out.println("Here");
                if(stopwatch==0)
                {
                    stopwatch++;
                    resetStopwatch.setVisible(false);
                    lapStopwatch.setVisible(true);
                    timer = new Timer();
                    TimerTask timerTask = new TimerTask() {
                        @Override
                        public void run() {
                            miliDisplayStopwatch++;
                            if(miliDisplayStopwatch == 1000)
                            {
                                miliDisplayStopwatch = 0;
                                sDisplayStopwatch++;
                            }
                            if(sDisplayStopwatch == 60)
                            {
                                sDisplayStopwatch = 0;
                                mDisplayStopwatch++;
                            }
                            String stopwatchDisplay = String.format("%02d : %02d : %03d", mDisplayStopwatch, sDisplayStopwatch, miliDisplayStopwatch);
                            stopwatchLabel.setText(stopwatchDisplay);
                        }
                    };
                    timer.scheduleAtFixedRate(timerTask, 0, 1);

                    stopwatchIsStopped = false;

                    startStopwatch.setVisible(false);
                    stopStopwatch.setVisible(true);
                }
                else
                {
                    stopwatch--;
                    resetStopwatch.setVisible(true);
                    resetStopwatch.setEnabled(true);
                    lapStopwatch.setVisible(false);
                    timer.cancel();

                    stopwatchIsStopped = true;

                    startStopwatch.setVisible(true);
                    stopStopwatch.setVisible(false);
                }
            }
            if(evt.getKeyCode()== KeyEvent.VK_L&&lapStopwatch.isVisible()==true)
            {
                stopwatchDisplay = String.format("%02d : %02d : %03d", mDisplayStopwatch, sDisplayStopwatch, miliDisplayStopwatch);
                lapStopwatchDisplay.setText(stopwatchDisplay);
            }
            if(evt.getKeyCode()== KeyEvent.VK_R&&resetStopwatch.isVisible()==true)
            {
                mDisplayStopwatch = 0;
                sDisplayStopwatch = 0;
                miliDisplayStopwatch = 0;
                stopwatchDisplay = String.format("%02d : %02d : %03d", mDisplayStopwatch, sDisplayStopwatch, miliDisplayStopwatch);
                stopwatchLabel.setText(stopwatchDisplay);

                lapStopwatchDisplay.setText("");
                startStopwatch.setVisible(true);
                stopStopwatch.setVisible(false);
                lapStopwatch.setVisible(false);
                resetStopwatch.setVisible(true);
                resetStopwatch.setEnabled(false);
            }
            if(evt.getKeyCode()== KeyEvent.VK_ENTER&&setAlarm.isVisible()==true)
            {
                timer2.cancel();
        
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                String dateStart = String.format("%02d/%02d/%d %02d:%02d:%02d", date, month, year, hour, min, sec);
                String dateStop = String.format("%02d/%02d/%d %02d:%02d:00", date, month, year, hDisplay, mDisplay);

                Date d1 = null;
                Date d2 = null;

                try {
                    d1 = format.parse(dateStart);
                    d2 = format.parse(dateStop);

                    diff = d2.getTime() - d1.getTime();

                    diffSeconds = diff/1000;

                    if(diffSeconds < 0)
                    {
                        dateStop = String.format("%02d/%02d/%d %02d:%02d:00", date+1, month, year, hDisplay, mDisplay);
                        d2 = format.parse(dateStop);
                        diff = d2.getTime() - d1.getTime();
                        diffSeconds = diff/1000;
                    }

                    diffSeconds = diff / 1000 % 60;
                    diffMinutes = diff / (60 * 1000) % 60;
                    diffHours = diff / (60 * 60 * 1000) % 24;

                    remainder = String.format("<html>Time remaining:<br>%d hours, %d minutes, and %d seconds</html>", diffHours, diffMinutes, diffSeconds);
                    timeRemaining.setText(remainder);
                } catch(Exception e) {
                    e.printStackTrace();
                }

                timer2 = new Timer();
                TimerTask timerTask2 = new TimerTask() {
                    @Override
                    public void run() {
                        diff--;
                        diffSeconds = diff / 1000 % 60;
                        diffMinutes = diff / (60 * 1000) % 60;
                        diffHours = diff / (60 * 60 * 1000) % 24; 
                        remainder = String.format("<html>Time remaining:<br>%d hours, %d minutes, and %d seconds</html>", diffHours, diffMinutes, diffSeconds);
                        timeRemaining.setText(remainder);
                    }
                };
                timer2.scheduleAtFixedRate(timerTask2, 0, 1);

                Timer timer3 = new Timer();
                TimerTask timerTask3 = new TimerTask() {
                    @Override
                    public void run() {
                        //THIS IS WHAT THE ALARM DOES!!
                        timer2.cancel();
                        if(alarmcount==0)
                        {
                            setAlarm.setVisible(false);
                            stopAlarm.setVisible(true);

                            MC.Stop();
                            MC.Play(songalarm);
                            play_button.setVisible(true);
                            pause_button.setVisible(false);
                        }
                        timeRemaining.setText("RINGG!!");
                        //stopAlarm.setVisible(true);
                    }
                };   
                timer3.schedule(timerTask3, diff);
            }
            if(evt.getKeyCode()== KeyEvent.VK_D&&stopAlarm.isVisible()==true)
            {
                MC.Stop();
                setAlarm.setVisible(true);
                stopAlarm.setVisible(false);
                timeRemaining.setText("");
            }
            if(evt.getKeyCode()== KeyEvent.VK_SPACE&&setAlarm.isVisible()==true)
            {
                if(setTime==0)
                {
                    setTime++;
                }
                else
                {
                    setTime--;
                }
            }
            if(evt.getKeyCode()== KeyEvent.VK_EQUALS&&setAlarm.isVisible()==true)
            {
                if(setTime==0)
                {
                    if(hDisplay == 23)
                    {
                        hDisplay = 0;
                    }
                    else
                    {
                        hDisplay++;
                    }
                    hourInAlarm.setText(String.format("%02d", hDisplay));
                }
                else
                {
                    if(mDisplay == 59)
                    {
                        mDisplay = 0;
                        if(hDisplay == 23)
                        {
                            hDisplay = 0;
                        }
                        else
                        {
                            hDisplay++;
                        } 
                    }
                    else
                    {
                        mDisplay++;
                    }
                    hourInAlarm.setText(String.format("%02d", hDisplay));
                    minuteInAlarm.setText(String.format("%02d", mDisplay));
                }
            }
            if(evt.getKeyCode()== KeyEvent.VK_MINUS&&setAlarm.isVisible()==true)
            {
                if(setTime==0)
                {
                    if(hDisplay == 0)
                    {
                        hDisplay = 23;
                    }
                    else
                    {
                        hDisplay--;
                    }
                    hourInAlarm.setText(String.format("%02d", hDisplay));
                }
                else
                {
                    if(mDisplay == 0)
                    {
                        mDisplay = 59;
                        if(hDisplay == 0)
                        {
                            hDisplay = 23;
                        }
                        else
                        {
                            hDisplay--;
                        }
                    }
                    else
                    {
                        mDisplay--;
                    }
                    hourInAlarm.setText(String.format("%02d", hDisplay));
                    minuteInAlarm.setText(String.format("%02d", mDisplay));
                }
            }
            if(evt.getKeyCode()== KeyEvent.VK_B&&background1.getX()<0)
            {
                    errorHandling++;
                    MC.Stop();
                    FileFilter filter = new FileNameExtensionFilter("MP3 Files","mp3","mpeg3");

                    JFileChooser chooser = new JFileChooser("C:\\Users\\Hp\\Desktop\\Music Video\\Sam Tsui Video\\Song");

                    chooser.addChoosableFileFilter(filter);

                    int returnVal = chooser.showOpenDialog(null);

                    if(returnVal == JFileChooser.APPROVE_OPTION)
                    {
                        File myFile = chooser.getSelectedFile();
                        String song = myFile + "";

                        String name = chooser.getSelectedFile().getName();

                        play_button.setVisible(false);
                        pause_button.setVisible(true);

                        MC.Play(song);
                        songTitle.setText(name);
                    }
            }
    }//GEN-LAST:event_shortcutJamKeyPressed

    private void songListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_songListKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_S&&background2.getX()>400)
            {
                System.out.println("Here");
                if(stopwatch==0)
                {
                    stopwatch++;
                    resetStopwatch.setVisible(false);
                    lapStopwatch.setVisible(true);
                    timer = new Timer();
                    TimerTask timerTask = new TimerTask() {
                        @Override
                        public void run() {
                            miliDisplayStopwatch++;
                            if(miliDisplayStopwatch == 1000)
                            {
                                miliDisplayStopwatch = 0;
                                sDisplayStopwatch++;
                            }
                            if(sDisplayStopwatch == 60)
                            {
                                sDisplayStopwatch = 0;
                                mDisplayStopwatch++;
                            }
                            String stopwatchDisplay = String.format("%02d : %02d : %03d", mDisplayStopwatch, sDisplayStopwatch, miliDisplayStopwatch);
                            stopwatchLabel.setText(stopwatchDisplay);
                        }
                    };
                    timer.scheduleAtFixedRate(timerTask, 0, 1);

                    stopwatchIsStopped = false;

                    startStopwatch.setVisible(false);
                    stopStopwatch.setVisible(true);
                }
                else
                {
                    stopwatch--;
                    resetStopwatch.setVisible(true);
                    resetStopwatch.setEnabled(true);
                    lapStopwatch.setVisible(false);
                    timer.cancel();

                    stopwatchIsStopped = true;

                    startStopwatch.setVisible(true);
                    stopStopwatch.setVisible(false);
                }
            }
        if(evt.getKeyCode()== KeyEvent.VK_ENTER&&background1.getX()<0)
            {
              String songChoose = String.valueOf(songList.getSelectedValue());
        if(songChoose.equals("Sam Tsui - Born This Way"))
        {
                    recentSong = 1;
                    MC.Stop();
                    
                    play_button.setVisible(false);
                    pause_button.setVisible(true);

                    MC.Play(song1);
                    songTitle.setText("Sam Tsui - Born This Way.mp3");
            }
        
        else if(songChoose.equals("Sam Tsui - Bring Me The Night"))
        {
                    recentSong = 2;    
                    MC.Stop();
                    
                    play_button.setVisible(false);
                    pause_button.setVisible(true);
                    
                    MC.Play(song2);
                    songTitle.setText("Sam Tsui - Bring Me The Night.mp3");
            }
        
        else if(songChoose.equals("Sam Tsui - DJ Got Us Falling In Love"))
        {
                    recentSong = 3;
                    MC.Stop();
                    
                    play_button.setVisible(false);
                    pause_button.setVisible(true);

                    MC.Play(song3);
                    songTitle.setText("Sam Tsui - DJ Got Us Falling In Love.mp3");
            }
        
        else if(songChoose.equals("Sam Tsui - Don't You Worry Child"))
        {
                    recentSong = 4;
                    MC.Stop();
                    
                    play_button.setVisible(false);
                    pause_button.setVisible(true);

                    MC.Play(song4);
                    songTitle.setText("Sam Tsui - Don't You Worry Child.mp3");
            }
        
        else if(songChoose.equals("Sam Tsui - Fireflies"))
        {
                    recentSong = 5;
                    MC.Stop();
                    
                    play_button.setVisible(false);
                    pause_button.setVisible(true);

                    MC.Play(song5);
                    songTitle.setText("Sam Tsui - Fireflies.mp3");
            }  
        }
        if(evt.getKeyCode()== KeyEvent.VK_B&&background1.getX()<0)
        {
                errorHandling++;
                MC.Stop();
                FileFilter filter = new FileNameExtensionFilter("MP3 Files","mp3","mpeg3");

                JFileChooser chooser = new JFileChooser("C:\\Users\\Hp\\Desktop\\Music Video\\Sam Tsui Video\\Song");

                chooser.addChoosableFileFilter(filter);

                int returnVal = chooser.showOpenDialog(null);

                if(returnVal == JFileChooser.APPROVE_OPTION)
                {
                    File myFile = chooser.getSelectedFile();
                    String song = myFile + "";

                    String name = chooser.getSelectedFile().getName();

                    play_button.setVisible(false);
                    pause_button.setVisible(true);

                    MC.Play(song);
                    songTitle.setText(name);
                }
        }
        if(evt.getKeyCode()== KeyEvent.VK_SPACE&&background1.getX()<0)
            {
                if(play_button.isVisible()==true)
                {
                    MC.Resume();
                    play_button.setVisible(false);
                    pause_button.setVisible(true);
                }
                else if(pause_button.isVisible()==true)
                {
                    MC.Pause();
                    play_button.setVisible(true);
                    pause_button.setVisible(false);
                }
            }
            if(evt.getKeyCode()== KeyEvent.VK_S&&background1.getX()<0)
            {
                MC.Stop();
                play_button.setVisible(true);
                pause_button.setVisible(false);
            }
            if(evt.getKeyCode()== KeyEvent.VK_LEFT && background1.getX()<0)
            {
                shortcutJam.setEnabled(true);
                songList.setEnabled(false);
                AnimationClass AC = new AnimationClass();

                AC.jLabelXRight(clockTitle.getX(), clockTitle.getX()+420, 5, 1, clockTitle);
                AC.jLabelXRight(MP3Title.getX(), MP3Title.getX()+420, 5, 1, MP3Title);
                AC.jLabelXRight(left_arrow.getX(), left_arrow.getX()+420, 5, 1, left_arrow);
                AC.jLabelXRight(rewind_button.getX(), rewind_button.getX()+420, 5, 1, rewind_button);
                AC.jLabelXRight(play_button.getX(), play_button.getX()+420, 5, 1, play_button);
                AC.jLabelXRight(pause_button.getX(), pause_button.getX()+420, 5, 1, pause_button);
                AC.jLabelXRight(forward_button.getX(), forward_button.getX()+420, 5, 1, forward_button);
                AC.jLabelXRight(stop_button.getX(), stop_button.getX()+420, 5, 1, stop_button);
                AC.jLabelXRight(select_file.getX(), select_file.getX()+420, 5, 1, select_file);
                AC.jTextFieldXRight(songTitle.getX(), songTitle.getX()+420, 5, 1, songTitle);
                AC.jTextAreaXRight(songListScrollPane.getX(), songListScrollPane.getX()+420, 5, 1, songListScrollPane);
                AC.jLabelXRight(background1.getX(), background1.getX()+420, 5, 1, background1);
                AC.jLabelXRight(clockLabel.getX(), clockLabel.getX()+420, 5, 1, clockLabel);
                AC.jLabelXRight(stopwatchLabel.getX(), stopwatchLabel.getX()+420, 5, 1, stopwatchLabel);
                AC.jLabelXRight(right_arrow.getX(), right_arrow.getX()+420, 5, 1, right_arrow);
                AC.jLabelXRight(alarm_button.getX(), alarm_button.getX()+420, 5, 1, alarm_button);

                AC.jLabelXRight(hourInAlarm.getX(), hourInAlarm.getX()+420, 5, 1, hourInAlarm);
                AC.jLabelXRight(minuteInAlarm.getX(), minuteInAlarm.getX()+420, 5, 1, minuteInAlarm);
                AC.jLabelXRight(colonSymbol.getX(), colonSymbol.getX()+420, 5, 1, colonSymbol);
                AC.jLabelXRight(backgroundHourDisplay.getX(), backgroundHourDisplay.getX()+420, 5, 1, backgroundHourDisplay);
                AC.jLabelXRight(backgroundMinuteDisplay.getX(), backgroundMinuteDisplay.getX()+420, 5, 1, backgroundMinuteDisplay);
                AC.jLabelXRight(plusHourButton.getX(), plusHourButton.getX()+420, 5, 1, plusHourButton);
                AC.jLabelXRight(minusHourButton.getX(), minusHourButton.getX()+420, 5, 1, minusHourButton);
                AC.jLabelXRight(plusMinuteButton.getX(), plusMinuteButton.getX()+420, 5, 1, plusMinuteButton);
                AC.jLabelXRight(minusMinuteButton.getX(), minusMinuteButton.getX()+420, 5, 1, minusMinuteButton);
                AC.jLabelXRight(timeRemaining.getX(), timeRemaining.getX()+420, 5, 1, timeRemaining);
                AC.jButtonXRight(setAlarm.getX(), setAlarm.getX()+420, 5, 1, setAlarm);
                AC.jButtonXRight(stopAlarm.getX(), stopAlarm.getX()+420, 5, 1, stopAlarm);

                AC.jLabelXRight(stopwatch_button.getX(), stopwatch_button.getX()+420, 5, 1, stopwatch_button);
                AC.jLabelXRight(lapStopwatchDisplay.getX(), lapStopwatchDisplay.getX()+420, 5, 1, lapStopwatchDisplay);
                AC.jButtonXRight(startStopwatch.getX(), startStopwatch.getX()+420, 5, 1, startStopwatch);
                AC.jButtonXRight(stopStopwatch.getX(), stopStopwatch.getX()+420, 5, 1, stopStopwatch);
                AC.jButtonXRight(resetStopwatch.getX(), resetStopwatch.getX()+420, 5, 1, resetStopwatch);
                AC.jButtonXRight(lapStopwatch.getX(), lapStopwatch.getX()+420, 5, 1, lapStopwatch);
                AC.jLabelXRight(clock_button.getX(), clock_button.getX()+420, 5, 1, clock_button);
                AC.jLabelXRight(background2.getX(), background2.getX()+420, 5, 1, background2);

                //AC.jTextFieldXRight(shortcutJam.getX(), shortcutJam.getX()+420, 5, 1, shortcutJam);
                //AC.jTextFieldXRight(shortcutMP3.getX(), shortcutMP3.getX()+420, 5, 1, shortcutMP3); 
            }
            if(evt.getKeyCode()== KeyEvent.VK_N&&background1.getX()<0)
            {
                if(recentSong+1<6)
                {
                    recentSong = recentSong+1;
            
                    if(recentSong==2)
                    {
                            MC.Stop();
                            
                            play_button.setVisible(false);
                            pause_button.setVisible(true);

                            MC.Play(song2);
                            songTitle.setText("Sam Tsui - Bring Me The Night.mp3");
                    }
                    if(recentSong==3)
                    {
                            MC.Stop();
                            
                            play_button.setVisible(false);
                            pause_button.setVisible(true);

                            MC.Play(song3);
                            songTitle.setText("Sam Tsui - DJ Got Us Falling In Love.mp3");
                    }
                    if(recentSong==4)
                    {
                            MC.Stop();
                            
                            play_button.setVisible(false);
                            pause_button.setVisible(true);

                            MC.Play(song4);
                            songTitle.setText("Sam Tsui - Don't You Worry Child.mp3");
                    }
                    if(recentSong==5)
                    {
                            MC.Stop();
                            
                            play_button.setVisible(false);
                            pause_button.setVisible(true);

                            MC.Play(song5);
                            songTitle.setText("Sam Tsui - Fireflies.mp3");
                    }
                }
                songList.setEnabled(true);
                shortcutJam.setEnabled(false);
            }
        
            if(evt.getKeyCode()== KeyEvent.VK_P&&background1.getX()<0)
            {
                if(recentSong-1>0)
                {
                    recentSong = recentSong-1;
                    if(recentSong==2)
                    {
                            MC.Stop();
                            
                            play_button.setVisible(false);
                            pause_button.setVisible(true);

                            MC.Play(song2);
                            songTitle.setText("Sam Tsui - Bring Me The Night.mp3");
                    }
                    if(recentSong==3)
                    {
                            MC.Stop();
                            
                            play_button.setVisible(false);
                            pause_button.setVisible(true);

                            MC.Play(song3);
                            songTitle.setText("Sam Tsui - DJ Got Us Falling In Love.mp3");
                    }
                    if(recentSong==4)
                    {
                            MC.Stop();
                            
                            play_button.setVisible(false);
                            pause_button.setVisible(true);

                            MC.Play(song4);
                            songTitle.setText("Sam Tsui - Don't You Worry Child.mp3");
                    }
                    if(recentSong==1)
                    {
                            MC.Stop();
                            
                            play_button.setVisible(false);
                            pause_button.setVisible(true);

                            MC.Play(song1);
                            songTitle.setText("Sam Tsui - Born This Way.mp3");
                    }
            }
                songList.setEnabled(true);
                shortcutJam.setEnabled(false);
        }
    }//GEN-LAST:event_songListKeyPressed

    private void helpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpButtonMouseClicked
        helpFrame.setVisible(true);
    }//GEN-LAST:event_helpButtonMouseClicked
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MP3Title;
    private javax.swing.JLabel alarm_button;
    private javax.swing.JLabel background1;
    private javax.swing.JLabel background2;
    private javax.swing.JLabel backgroundHourDisplay;
    private javax.swing.JLabel backgroundMinuteDisplay;
    private javax.swing.JLabel clockLabel;
    private javax.swing.JLabel clockTitle;
    private javax.swing.JLabel clock_button;
    private javax.swing.JLabel close_button;
    private javax.swing.JLabel colonSymbol;
    private javax.swing.JLabel custom_frame;
    private javax.swing.JLabel forward_button;
    private javax.swing.JLabel helpButton;
    private javax.swing.JLabel hourInAlarm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton lapStopwatch;
    private javax.swing.JLabel lapStopwatchDisplay;
    private javax.swing.JLabel left_arrow;
    private javax.swing.JLabel minimize_button;
    private javax.swing.JLabel minusHourButton;
    private javax.swing.JLabel minusMinuteButton;
    private javax.swing.JLabel minuteInAlarm;
    private javax.swing.JLabel pause_button;
    private javax.swing.JLabel play_button;
    private javax.swing.JLabel plusHourButton;
    private javax.swing.JLabel plusMinuteButton;
    private javax.swing.JButton resetStopwatch;
    private javax.swing.JLabel rewind_button;
    private javax.swing.JLabel right_arrow;
    private javax.swing.JLabel select_file;
    private javax.swing.JButton setAlarm;
    private javax.swing.JTextField shortcutJam;
    private javax.swing.JList songList;
    private javax.swing.JScrollPane songListScrollPane;
    public static javax.swing.JTextField songTitle;
    private javax.swing.JButton startStopwatch;
    private javax.swing.JButton stopAlarm;
    private javax.swing.JButton stopStopwatch;
    private javax.swing.JLabel stop_button;
    private javax.swing.JLabel stopwatchLabel;
    private javax.swing.JLabel stopwatch_button;
    private javax.swing.JLabel timeRemaining;
    // End of variables declaration//GEN-END:variables
}